package com.tech.tech_device_management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(
        uniqueConstraints = @UniqueConstraint(columnNames={"model_name","brand_id"})
)
public class Model {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

   /* @Column(name="brand_id", nullable=false)
    private Long brandId;*/

    @ManyToOne()
    @JoinColumn(name="brand_id", nullable=false)
    private Brand brand;



    @Column(name="model_name", nullable=false , unique = true)
    private String modelName;

   /* @OneToMany(mappedBy="job",cascade=CascadeType.ALL, orphanRemoval=true)*/


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
