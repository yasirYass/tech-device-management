package com.tech.tech_device_management.service.Impl;

import com.tech.tech_device_management.constant.ErrorResponseConstant;
import com.tech.tech_device_management.entity.Brand;
import com.tech.tech_device_management.exception.TechDeviceManagementException;
import com.tech.tech_device_management.repository.BrandRepository;
import com.tech.tech_device_management.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    @Override
    public void saveNewBrand(String brandName)  {

        Optional<Brand> existBrand=brandRepository.findByBrandName(brandName);

        if(existBrand.isPresent())
            throw new TechDeviceManagementException(ErrorResponseConstant.brandAlreadyExist,1200);
        brandRepository.save(Brand.builder().brandName(brandName).build());

    }
}
