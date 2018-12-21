package com.eversis.spaceagencydatahub.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MissionDto {

    private Long id;
    private String missionName;
    private LocalDate missionStartDate;
    private LocalDate missionFinishDate;
    private ImageryType imageryType;
    private List<Product> products;

    public MissionDto(Long id, String missionName, LocalDate missionStartDate, LocalDate missionFinishDate, ImageryType imageryType) {
        this.id = id;
        this.missionName = missionName;
        this.missionStartDate = missionStartDate;
        this.missionFinishDate = missionFinishDate;
        this.imageryType = imageryType;
        products = new ArrayList<>();
    }

    public MissionDto() {
    }

    public Long getId() {
        return id;
    }

    public String getMissionName() {
        return missionName;
    }

    public LocalDate getMissionStartDate() {
        return missionStartDate;
    }

    public LocalDate getMissionFinishDate() {
        return missionFinishDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public ImageryType getImageryType() {
        return imageryType;
    }
}
