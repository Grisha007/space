package com.eversis.spaceagencydatahub.data.domain;

import com.eversis.spaceagencydatahub.data.imagery.ImageryType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MissionDto {

    private Long id;
    private String missionName;
    private LocalDate missionStartDate;
    private LocalDate missionFinishDate;
    private List<Product> products;
    protected ImageryType imageryType;

    public MissionDto(String missionName, LocalDate missionStartDate, LocalDate missionFinishDate) {
        this.missionName = missionName;
        this.missionStartDate = missionStartDate;
        this.missionFinishDate = missionFinishDate;
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
