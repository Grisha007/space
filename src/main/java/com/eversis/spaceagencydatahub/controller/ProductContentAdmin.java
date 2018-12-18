package com.eversis.spaceagencydatahub.controller;

import com.eversis.spaceagencydatahub.data.domain.MissionDto;
import com.eversis.spaceagencydatahub.data.domain.ProductDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/pca")
public class ProductContentAdmin {

    @RequestMapping(method = RequestMethod.POST, value = "createMission")
    public void createMission(MissionDto missionDto) {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateMission")
    public MissionDto updateMission(MissionDto missionDto) {
        return new MissionDto();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteMission")
    public void deleteMission(Long id) {

    }

    @RequestMapping(method = RequestMethod.POST, value = "createProduct")
    public void createProduct(ProductDto productDto) {

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteProduct")
    public void deleteProduct(Long id) {

    }
}
