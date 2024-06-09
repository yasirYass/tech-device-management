package com.tech.tech_device_management.entity;

import com.tech.tech_device_management.enums.JobStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="brand_id", nullable=false)
    private Long brandId;

    @Column(name="model_id", nullable=false)
    private Long modelId;

    @Column(name="customer_name", nullable=false)
    private String customerName;

    @Column(name="phone_no", nullable=false, length = 10)
    private Long phoneNo;

    @Column(name="advance_amount")
    private double advanceAmount;

    @Enumerated(EnumType.ORDINAL)
    private JobStatus jobStatus;

    private String remarks;

    private String image1;

    private String image2;

    private String image3;

    private String image4;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;

    @PrePersist
    public void prePersist(){
        this.createdAt=LocalDateTime.now();
        this.jobStatus=JobStatus.HOLD;

    }




}
