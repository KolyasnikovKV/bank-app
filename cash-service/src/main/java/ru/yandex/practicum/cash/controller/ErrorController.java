package ru.yandex.practicum.cash.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.yandex.practicum.account.model.ResponseInfo;
import ru.yandex.practicum.account.model.ResponseInfoError;
import ru.yandex.practicum.cash.error.OperationFailedException;

@ControllerAdvice
public class ErrorController {

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(exception = OperationFailedException.class)
    public ResponseInfo handleUserNotFoundException(OperationFailedException e) {
        return new ResponseInfo().status(false).error(new ResponseInfoError().errorMessage(e.getMessage()));
    }
}
