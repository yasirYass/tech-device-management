package com.tech.tech_device_management.exception;

public class TechDeviceManagementException extends RuntimeException {

    private int errorCode;

    public TechDeviceManagementException(String msg,int errorCode){
        super(msg);
        this.errorCode=errorCode;

    }

    public int getErrorCode(){
       return this.errorCode;
    }



}
