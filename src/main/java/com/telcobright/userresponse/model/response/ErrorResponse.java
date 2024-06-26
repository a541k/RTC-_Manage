package com.telcobright.userresponse.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
    HttpStatus httpStatus;
    String message;
}