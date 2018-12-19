package com.eversis.spaceagencydatahub.mapper;

import com.eversis.spaceagencydatahub.domain.ImageryType;
import com.eversis.spaceagencydatahub.domain.Mission;
import com.eversis.spaceagencydatahub.domain.MissionDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MissionMapperTestSuite {

    @Autowired
    private MissionMapper missionMapper;

    @Test
    public void testMapToMission() {
        //Given
        MissionDto missionDto = new MissionDto("Mission one", LocalDate.of(2018, 7, 19), LocalDate.of(2018, 11, 7), ImageryType.PANCHROMATIC);

        //When
        Mission mappedMission = missionMapper.mapToMission(missionDto);

        //Then
        assertEquals("Mission one", mappedMission.getMissionName());
        assertEquals(LocalDate.of(2018, 7, 19), mappedMission.getMissionStartDate());
        assertEquals(LocalDate.of(2018, 11, 7), mappedMission.getMissionFinishDate());
        assertEquals(ImageryType.PANCHROMATIC, mappedMission.getImageryType());
    }

    @Test
    public void testMapToMissionDto() {
        //Given
        Mission mission = new Mission("Mission two", LocalDate.of(2018, 7, 19), LocalDate.of(2018, 11, 7), ImageryType.MULTISPECTRAL);

        //When
        MissionDto mappedMissionDto = missionMapper.mapToMissionDto(mission);

        //Then
        assertEquals("Mission two", mappedMissionDto.getMissionName());
        assertEquals(LocalDate.of(2018, 7, 19), mappedMissionDto.getMissionStartDate());
        assertEquals(LocalDate.of(2018, 11, 7), mappedMissionDto.getMissionFinishDate());
        assertEquals(ImageryType.MULTISPECTRAL, mappedMissionDto.getImageryType());
    }

    @Test
    public void testMapToMissionDtoList() {
        //Given
        Mission mission = new Mission("Mission three", LocalDate.of(2018, 7, 19), LocalDate.of(2018, 11, 7), ImageryType.HYPERSPECTRAL);
        List<Mission> missionList = new ArrayList<>();
        missionList.add(mission);

        //When
        List<MissionDto> mappedListMissionDto = missionMapper.mapToMissionDtoList(missionList);

        //Then
        assertEquals(1, mappedListMissionDto.size());
        assertEquals("Mission three", mappedListMissionDto.get(0).getMissionName());
        assertEquals(LocalDate.of(2018, 7, 19), mappedListMissionDto.get(0).getMissionStartDate());
        assertEquals(LocalDate.of(2018, 11, 7), mappedListMissionDto.get(0).getMissionFinishDate());
        assertEquals(ImageryType.HYPERSPECTRAL, mappedListMissionDto.get(0).getImageryType());
    }
}