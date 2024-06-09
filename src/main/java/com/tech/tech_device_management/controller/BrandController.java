package com.tech.tech_device_management.controller;


import com.tech.tech_device_management.exception.TechDeviceManagementException;
import com.tech.tech_device_management.service.BrandService;
import com.tech.tech_device_management.service.Impl.BrandServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/brand")
@RequiredArgsConstructor
public class BrandController {

    private final BrandService brandService;



    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewBrand(@RequestBody String brandName) {
        brandService.saveNewBrand(brandName);

    }


}
