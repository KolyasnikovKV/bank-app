package ru.yandex.practicum.transfer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ru.yandex.practicum.account.api.AccountApi;
import ru.yandex.practicum.account.api.UserApi;
import ru.yandex.practicum.account.model.ResponseInfo;
import ru.yandex.practicum.account.model.UserInfo;
import ru.yandex.practicum.account.model.UserInfoRs;
import ru.yandex.practicum.notification.api.NotificationApi;
import ru.yandex.practicum.notification.model.SendNotificationRq;
import ru.yandex.practicum.transfer.error.OperationFailedException;
import ru.yandex.practicum.transfer.model.TransferCashRq;
import ru.yandex.practicum.transfer.util.RestClientUtility;

import java.math.BigDecimal;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransferService {

    private final AccountApi accountApi;
    private final NotificationApi notificationApi;
    private final UserApi userApi;

    public void transfer(String fromUser, String toUser, TransferCashRq transferCashRq) {
        var result = transfer(fromUser, toUser, transferCashRq, transferCashRq.getValue());
        if (BooleanUtils.isFalse(result.getStatus())) {
            throw new OperationFailedException(result.getError().getErrorMessage());
        }
        sendUserNotification(transferCashRq, getUserInfo(fromUser), toUser);
    }

    private ResponseInfo transfer(String fromUser, String toUser, TransferCashRq transferCashRq, BigDecimal exchangedValue) {
        var request = new ru.yandex.practicum.account.model.TransferCashRq()
                .fromAccount(transferCashRq.getFromAccount())
                .fromAccountValue(transferCashRq.getValue())
                .toAccount(transferCashRq.getToAccount())
                .toUser(toUser)
                .toAccountValue(exchangedValue);
        return accountApi.transferCash(fromUser, request)
                .onErrorResume(
                        RestClientUtility::isWebClientResponseException,
                        t -> Mono.just(RestClientUtility.getResponseBodyFromError(t, ResponseInfo.class))
                ).block();
    }

    private UserInfo getUserInfo(String userName) {
        return userApi.getUserInfoByUsername(userName).map(UserInfoRs::getUserInfo).block();
    }

    private void sendUserNotification(TransferCashRq requestInfo, UserInfo userInfo, String toUser) {
        String subject = "Перевод средств";
        String text = """
        Уважаемый %s!
        Уведомляем Вас, что с Вашего счета %s сняты наличные в размере %s.
        Средства переведены пользователю %s на счет %s""".formatted(
                userInfo.getFullName(),
                requestInfo.getFromAccount(),
                requestInfo.getValue(),
                toUser,
                requestInfo.getToAccount()
        );
        notificationApi.sendNotification(
                        new SendNotificationRq()
                                .userMail(userInfo.getEmail())
                                .subject(subject)
                                .text(text)
                )
                .doOnError(t -> log.error("При попытке отправить уведомление получена ошибка: {}", t.getMessage()))
                .onErrorComplete()
                .block();
    }
}
