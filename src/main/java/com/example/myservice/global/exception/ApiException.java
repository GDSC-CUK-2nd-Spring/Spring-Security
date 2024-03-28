package com.example.myservice.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class ApiException extends RuntimeException{
    private ApiResponseStatus status;
}
