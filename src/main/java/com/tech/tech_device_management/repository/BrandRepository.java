package com.tech.tech_device_management.repository;

import com.tech.tech_device_management.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrandRepository extends JpaRepository<Brand,Long> {

    Optional<Brand> findByBrandName(String brandName);
}
