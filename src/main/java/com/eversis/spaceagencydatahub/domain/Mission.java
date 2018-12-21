package com.eversis.spaceagencydatahub.domain;

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
    private ImageryType imageryType;
    private List<Product> products;

    public Mission(String missionName, LocalDate missionStartDate, LocalDate missionFinishDate, ImageryType imageryType) {
        this.missionName = missionName;
        this.missionStartDate = missionStartDate;
        this.missionFinishDate = missionFinishDate;
        this.imageryType = imageryType;
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

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "IMAGERY_TYPE")
    public ImageryType getImageryType() {
        return imageryType;
    }

    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "mission"
    )
    public List<Product> getProducts() {
        return products;
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

    public void setImageryType(ImageryType imageryType) {
        this.imageryType = imageryType;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
