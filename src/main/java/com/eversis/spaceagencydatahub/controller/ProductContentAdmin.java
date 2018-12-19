package com.eversis.spaceagencydatahub.controller;

import com.eversis.spaceagencydatahub.domain.Mission;
import com.eversis.spaceagencydatahub.domain.MissionDto;
import com.eversis.spaceagencydatahub.domain.ProductDto;
import com.eversis.spaceagencydatahub.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class ProductContentAdmin {

    @Autowired
    private DbService dbService;

    @GetMapping(value = "/mission")
    public void createMission(MissionDto missionDto) {

    }

    @GetMapping(value = "/mission/{idm}")
    public MissionDto updateMission(@PathVariable(name = "idm") Long missionId) {
        return new MissionDto();
    }

    @GetMapping(value = "/mission/{idm}")
    public void deleteMission(@PathVariable(name = "idm") Long missionId) {

    }

    @GetMapping(value = "/mission/{idm}/product")
    public void createProduct(@PathVariable(name = "idm") Long missionId, ProductDto productDto) {

    }

    @GetMapping(value = "/mission/{idm}/product/{idp}")
    public void deleteProduct(@PathVariable(name = "idm") Long missionId, @PathVariable(name = "idp") Long productId) {

    }

    @GetMapping(value = "/mission/{missionName}")
    public ProductDto getProductByMissionName(@PathVariable(name = "missionName") Mission mission) {
        return new ProductDto();
    }

    @GetMapping(value = "/mission/{idm}/product/{productType}")
    public ProductDto getProductByProductType(@PathVariable(name = "idm") Long missionId, @PathVariable(name = "productType") ProductDto productDto) {
        return new ProductDto();
    }

    @GetMapping(value = "/mission/{idm}/product/{acquisitionDate}")
    public ProductDto getProductByAcquisitionDate(@PathVariable(name = "idm") Long missionId, @PathVariable(name = "acquisitionDate") ProductDto productDto) {
        return new ProductDto();
    }

    @GetMapping(value = "/mission/{idm}/product")
    public List<ProductDto> getMultipleProducts(@PathVariable(name = "idm") Long missionId, ProductDto productDto) {
        return new ArrayList<>();
    }

//    @GetMapping(value = "/mission")
//    public List<MissionDto> getAllMissions() {
//        return new ArrayList<>();
//    }
//
//    @GetMapping(value = "/mission/{idm}")
//    public MissionDto getMission(@PathVariable(name = "idm") Long missionId) {
//        return new MissionDto();
//    }
}
