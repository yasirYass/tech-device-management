package com.tech.tech_device_management.dto.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {

    private int errorCode;

    private String errorMessage;


    public ErrorResponse(int errorCode,String errorMessage){

        this.errorCode=errorCode;

        this.errorMessage=errorMessage;

    }

}
