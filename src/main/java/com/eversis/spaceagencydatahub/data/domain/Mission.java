package com.eversis.spaceagencydatahub.data.domain;

import com.eversis.spaceagencydatahub.data.imagery.ImageryType;
import com.eversis.spaceagencydatahub.data.domain.Product;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MISSIONS")
public class Mission {

    private Long id;
    private String missionName;
    private LocalDate missionStartDate;
    private LocalDate missionFinishDate;
    private List<Product> products;
    protected ImageryType imageryType;

    public Mission(String missionName, LocalDate missionStartDate, LocalDate missionFinishDate) {
        this.missionName = missionName;
        this.missionStartDate = missionStartDate;
        this.missionFinishDate = missionFinishDate;
        products = new ArrayList<>();
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
    @Column(name = "MISSION_START_DATE")
    public LocalDate getMissionStartDate() {
        return missionStartDate;
    }

    @NotNull
    @Column(name = "MISSION_END_DATE")
    public LocalDate getMissionFinishDate() {
        return missionFinishDate;
    }

    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "mission"
    )
    public List<Product> getProducts() {
        return products;
    }

    @NotNull
    @Column(name = "IMAGERY_TYPE")
    public ImageryType getImageryType() {
        return imageryType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public void setMissionStartDate(LocalDate missionStartDate) {
        this.missionStartDate = missionStartDate;
    }

    public void setMissionFinishDate(LocalDate missionFinishDate) {
        this.missionFinishDate = missionFinishDate;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setImageryType(ImageryType imageryType) {
        this.imageryType = imageryType;
    }
}