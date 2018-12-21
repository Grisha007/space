package com.eversis.spaceagencydatahub.controller;

import com.eversis.spaceagencydatahub.domain.MissionDto;
import com.eversis.spaceagencydatahub.domain.ProductDto;
import com.eversis.spaceagencydatahub.mapper.MissionMapper;
import com.eversis.spaceagencydatahub.mapper.ProductMapper;
import com.eversis.spaceagencydatahub.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class ProductContentAdmin {

    @Autowired
    private DbService dbService;

    @Autowired
    private MissionMapper missionMapper;

    @Autowired
    private ProductMapper productMapper;

    @PostMapping(value = "/mission")
    public void createMission(@RequestBody MissionDto missionDto) {
        dbService.saveMission((missionMapper.mapToMission(missionDto)));
    }

    @PutMapping(value = "/mission")
    public MissionDto updateMission(@RequestBody MissionDto missionDto) {
        return missionMapper.mapToMissionDto(dbService.saveMission(missionMapper.mapToMission(missionDto)));
    }

    @DeleteMapping(value = "/mission/{idm}")
    public void deleteMission(@PathVariable(name = "idm") Long missionId) {
        dbService.deleteMission(missionId);
    }

    @PostMapping(value = "/product")
    public void createProduct(@RequestBody ProductDto productDto) {
        dbService.saveProduct(productMapper.mapToProduct(productDto));
    }

    @GetMapping(value = "/findProduct/{idp}")
    public ProductDto getProductById(@PathVariable(name = "idp") Long productId) throws ProductNotFoundException {
        return productMapper.mapToProductDto(dbService.getProduct(productId).orElseThrow(ProductNotFoundException::new));
    }

    @DeleteMapping(value = "/product/{idp}")
    public void deleteProductById(@PathVariable(name = "idp") Long productId) {
        dbService.deleteProduct(productId);
    }
}
