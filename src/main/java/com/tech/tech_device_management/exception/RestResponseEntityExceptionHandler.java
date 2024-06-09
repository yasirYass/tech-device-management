package com.tech.tech_device_management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.tech.tech_device_management.dto.response.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler  {
    @ExceptionHandler(TechDeviceManagementException.class)
    public ResponseEntity<ErrorResponse> handleTechDeviceManagementException(TechDeviceManagementException exception){

        return new ResponseEntity<>(ErrorResponse.builder().errorCode(exception.getErrorCode()).errorMessage(exception.getMessage())
                .build(), HttpStatus.BAD_REQUEST);
    }
}
