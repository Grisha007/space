package com.eversis.spaceagencydatahub.data.missions;

import com.eversis.spaceagencydatahub.data.domain.Mission;
import com.eversis.spaceagencydatahub.data.imagery.PanchromaticImage;

import java.time.LocalDate;

public class PanchromaticMission extends Mission {
    public PanchromaticMission(String missionName, LocalDate missionStartDate, LocalDate missionFinishDate) {
        super(missionName, missionStartDate, missionFinishDate);
        this.imageryType = new PanchromaticImage();
    }
}
