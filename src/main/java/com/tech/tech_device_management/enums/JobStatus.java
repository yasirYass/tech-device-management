package com.tech.tech_device_management.enums;

public enum JobStatus {
    HOLD(0),
    PENDING(1),

    COMPLETED(2);

    private final int value;

    JobStatus(int value){
        this.value=value;
    }

    public int getValue(){
        return  value;
    }
}
