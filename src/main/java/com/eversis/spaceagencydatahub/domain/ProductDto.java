package com.eversis.spaceagencydatahub.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductDto {
    private Long id;
    private Mission mission;
    private LocalDate acquisitionDate;
    private Coordinates coordinates;
    private BigDecimal productPrice;
    private String productURL;

    public ProductDto(Mission mission, LocalDate acquisitionDate, Coordinates coordinates, BigDecimal productPrice, String productURL) {
        this.mission = mission;
        this.acquisitionDate = acquisitionDate;
        this.coordinates = coordinates;
        this.productPrice = productPrice;
        this.productURL = productURL;
    }

    public ProductDto() {
    }

    public Long getId() {
        return id;
    }

    public Mission getMission() {
        return mission;
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public String getProductURL() {
        return productURL;
    }
}
