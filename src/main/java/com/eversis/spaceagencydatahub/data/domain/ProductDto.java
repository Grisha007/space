package com.eversis.spaceagencydatahub.data.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductDto {
    private Long id;
    private String missionName;
    private LocalDate acquisitionDate;
    private BigDecimal firstCoordinate;
    private BigDecimal secondCoordinate;
    private BigDecimal thirdCoordinate;
    private BigDecimal fourthCoordinate;
    private BigDecimal productPrice;
    private String productURL;
    private Mission mission;

    public ProductDto(LocalDate acquisitionDate, BigDecimal firstCoordinate, BigDecimal secondCoordinate, BigDecimal thirdCoordinate, BigDecimal fourthCoordinate, BigDecimal productPrice, String productURL) {
        this.acquisitionDate = acquisitionDate;
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        this.fourthCoordinate = fourthCoordinate;
        this.productPrice = productPrice;
        this.productURL = productURL;
        this.missionName = mission.getMissionName();
    }

    public ProductDto() {
    }

    public Long getId() {
        return id;
    }

    public String getMissionName() {
        return missionName;
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public BigDecimal getFirstCoordinate() {
        return firstCoordinate;
    }

    public BigDecimal getSecondCoordinate() {
        return secondCoordinate;
    }

    public BigDecimal getThirdCoordinate() {
        return thirdCoordinate;
    }

    public BigDecimal getFourthCoordinate() {
        return fourthCoordinate;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public String getProductURL() {
        return productURL;
    }

    public Mission getMission() {
        return mission;
    }
}
