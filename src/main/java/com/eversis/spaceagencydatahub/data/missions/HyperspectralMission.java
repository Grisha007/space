package com.eversis.spaceagencydatahub.data.missions;

import com.eversis.spaceagencydatahub.data.domain.Mission;
import com.eversis.spaceagencydatahub.data.imagery.HyperspectralImage;

import java.time.LocalDate;

public class HyperspectralMission extends Mission {
    public HyperspectralMission(String missionName, LocalDate missionStartDate, LocalDate missionFinishDate) {
        super(missionName, missionStartDate, missionFinishDate);
        this.imageryType = new HyperspectralImage();
    }
}
