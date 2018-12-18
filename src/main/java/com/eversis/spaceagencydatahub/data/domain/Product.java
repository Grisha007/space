package com.eversis.spaceagencydatahub.data.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PRODUCTS")
public class Product {

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

    public Product(LocalDate acquisitionDate, BigDecimal firstCoordinate, BigDecimal secondCoordinate, BigDecimal thirdCoordinate, BigDecimal fourthCoordinate, BigDecimal productPrice, String productURL) {
        this.acquisitionDate = acquisitionDate;
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        this.fourthCoordinate = fourthCoordinate;
        this.productPrice = productPrice;
        this.productURL = productURL;
        this.missionName = mission.getMissionName();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }

    @NotNull
    @Column(name = "MISSION_NAME")
    public String getMissionName() {
        return missionName;
    }

    @NotNull
    @Column(name = "ACQUISITION_DATE")
    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    @NotNull
    @Column(name = "FIRST_COORDINATE")
    public BigDecimal getFirstCoordinate() {
        return firstCoordinate;
    }

    @NotNull
    @Column(name = "SECOND_COORDINATE")
    public BigDecimal getSecondCoordinate() {
        return secondCoordinate;
    }

    @NotNull
    @Column(name = "THIRD_COORDINATE")
    public BigDecimal getThirdCoordinate() {
        return thirdCoordinate;
    }

    @NotNull
    @Column(name = "FOURTH_COORDINATE")
    public BigDecimal getFourthCoordinate() {
        return fourthCoordinate;
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

    @ManyToOne
    @JoinColumn(name = "MISSION_ID")
    public Mission getMission() {
        return mission;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public void setFirstCoordinate(BigDecimal firstCoordinate) {
        this.firstCoordinate = firstCoordinate;
    }

    public void setSecondCoordinate(BigDecimal secondCoordinate) {
        this.secondCoordinate = secondCoordinate;
    }

    public void setThirdCoordinate(BigDecimal thirdCoordinate) {
        this.thirdCoordinate = thirdCoordinate;
    }

    public void setFourthCoordinate(BigDecimal fourthCoordinate) {
        this.fourthCoordinate = fourthCoordinate;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductURL(String productURL) {
        this.productURL = productURL;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }
}
