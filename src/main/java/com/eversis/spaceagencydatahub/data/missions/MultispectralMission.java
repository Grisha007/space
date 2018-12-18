package com.eversis.spaceagencydatahub.data.missions;

import com.eversis.spaceagencydatahub.data.domain.Mission;
import com.eversis.spaceagencydatahub.data.imagery.MultispectralImage;

import java.time.LocalDate;

public class MultispectralMission extends Mission {
    public MultispectralMission(String missionName, LocalDate missionStartDate, LocalDate missionFinishDate) {
        super(missionName, missionStartDate, missionFinishDate);
        this.imageryType = new MultispectralImage();
    }
}
