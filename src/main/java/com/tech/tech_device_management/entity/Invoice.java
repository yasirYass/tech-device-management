package com.tech.tech_device_management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="job_id", nullable=false)
    private Long jobId;

    @Column(name="product_and_Service",nullable=false)
    private String productAndService;


    private int quantity;

    @Column(nullable=false)
    private double price;

    private float gst;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;

    @PrePersist
    public void prePersist(){this.createdAt=LocalDateTime.now();}
}
