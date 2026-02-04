package ru.yandex.practicum.cash.notification.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
import ru.yandex.practicum.cash.notification.ApiClient;
import ru.yandex.practicum.cash.notification.model.SendNotificationRq;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-17T11:33:16.283603800+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.12.0")
public class NotificationApi {
    private ApiClient apiClient;

    public NotificationApi() {
        this(new ApiClient());
    }

    @Autowired
    public NotificationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Отправить уведомление по операции
     * Сервис получает запрос на отправку уведомления и выполняет запрос к почтовому серверу
     * <p><b>200</b> - OK
     * @param sendNotificationRq The sendNotificationRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec sendNotificationRequestCreation(SendNotificationRq sendNotificationRq) throws WebClientResponseException {
        Object postBody = sendNotificationRq;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/notification/send", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Отправить уведомление по операции
     * Сервис получает запрос на отправку уведомления и выполняет запрос к почтовому серверу
     * <p><b>200</b> - OK
     * @param sendNotificationRq The sendNotificationRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> sendNotification(SendNotificationRq sendNotificationRq) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return sendNotificationRequestCreation(sendNotificationRq).bodyToMono(localVarReturnType);
    }

    /**
     * Отправить уведомление по операции
     * Сервис получает запрос на отправку уведомления и выполняет запрос к почтовому серверу
     * <p><b>200</b> - OK
     * @param sendNotificationRq The sendNotificationRq parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> sendNotificationWithHttpInfo(SendNotificationRq sendNotificationRq) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return sendNotificationRequestCreation(sendNotificationRq).toEntity(localVarReturnType);
    }

    /**
     * Отправить уведомление по операции
     * Сервис получает запрос на отправку уведомления и выполняет запрос к почтовому серверу
     * <p><b>200</b> - OK
     * @param sendNotificationRq The sendNotificationRq parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec sendNotificationWithResponseSpec(SendNotificationRq sendNotificationRq) throws WebClientResponseException {
        return sendNotificationRequestCreation(sendNotificationRq);
    }
}
