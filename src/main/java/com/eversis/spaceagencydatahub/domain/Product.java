package com.eversis.spaceagencydatahub.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    private Long id;
    private Mission mission;
    private LocalDate acquisitionDate;
    private Coordinates coordinates;
    private BigDecimal productPrice;
    private String productURL;

    public Product(Mission mission, LocalDate acquisitionDate, Coordinates coordinates, BigDecimal productPrice, String productURL) {
        this.mission = mission;
        this.acquisitionDate = acquisitionDate;
        this.coordinates = coordinates;
        this.productPrice = productPrice;
        this.productURL = productURL;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "MISSION_ID")
    public Mission getMission() {
        return mission;
    }

    @NotNull
    @Column(name = "ACQUISITION_DATE")
    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    @NotNull
    @Column(name = "COORDINATES")
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @NotNull
    @Column(name = "PRODUCT_PRICE")
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    @NotNull
    @Column(name = "PRODUCT_URL")
    public String getProductURL() {
        return productURL;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductURL(String productURL) {
        this.productURL = productURL;
    }
}
