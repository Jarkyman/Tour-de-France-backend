package com.example.tourdkbackend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class TeamExceptionHandler {

    @ExceptionHandler(value = {TeamNotCreatedException.class})
    public ResponseEntity<Object> handelException(TeamNotCreatedException e) {
        HttpStatus badRequest = HttpStatus.NOT_ACCEPTABLE;

        TeamException teamException = new TeamException(
                e.getMessage(),
                badRequest,
                ZonedDateTime.now(ZoneId.of("+2"))
        );

        return new ResponseEntity<>(teamException, badRequest);
    }

}
