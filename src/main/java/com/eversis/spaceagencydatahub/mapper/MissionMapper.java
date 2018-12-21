package com.eversis.spaceagencydatahub.mapper;

import com.eversis.spaceagencydatahub.domain.Mission;
import com.eversis.spaceagencydatahub.domain.MissionDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MissionMapper {
    public Mission mapToMission(MissionDto missionDto) {
        return new Mission(missionDto.getMissionName(), missionDto.getMissionStartDate(), missionDto.getMissionFinishDate(), missionDto.getImageryType());
    }

    public MissionDto mapToMissionDto(Mission mission) {
        return new MissionDto(mission.getId(), mission.getMissionName(), mission.getMissionStartDate(), mission.getMissionFinishDate(), mission.getImageryType());
    }

    public List<MissionDto> mapToMissionDtoList(final List<Mission> missionList) {
        return missionList.stream()
                .map(m -> new MissionDto(m.getId(), m.getMissionName(), m.getMissionStartDate(), m.getMissionFinishDate(), m.getImageryType()))
                .collect(Collectors.toList());
    }
}
