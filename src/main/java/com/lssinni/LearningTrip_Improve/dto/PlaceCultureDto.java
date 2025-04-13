package com.lssinni.LearningTrip_Improve.dto;

import com.lssinni.LearningTrip_Improve.domain.Place;
import com.lssinni.LearningTrip_Improve.domain.PlaceCulture;
import com.lssinni.LearningTrip_Improve.domain.PlaceTour;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class PlaceCultureDto extends PlaceDto {

    private String experienceAge;       // 체험가능연령

    private String experienceInfo;      // 체험안내

    private Boolean worldCulturalHeritage;    // 세계문화유산 유무

    private Boolean worldNaturalHeritage;    // 세계자연유산 유무

    private Boolean worldRecordHeritage;     // 세계기록유산 유무

    public static PlaceCultureDto toDto(PlaceCulture placeCulture) {
        return PlaceCultureDto.builder()
            .id(placeCulture.getId())
            .name(placeCulture.getName())
            .description(placeCulture.getDescription())
            .imageURL1(placeCulture.getImageURL1())
            .imageURL2(placeCulture.getImageURL2())
            .address(placeCulture.getAddress())
            .latitude(placeCulture.getLatitude())
            .longitude(placeCulture.getLongitude())
            .tel(placeCulture.getTel())
            .info(placeCulture.getInfo())
            .restDate(placeCulture.getRestDate())
            .useTime(placeCulture.getUseTime())
            .parking(placeCulture.getParking())
            .babyCarriage(placeCulture.getBabyCarriage())
            .pet(placeCulture.getPet())
            .textbook(placeCulture.getTextbook())
            .experienceAge(placeCulture.getExperienceAge())
            .experienceInfo(placeCulture.getExperienceInfo())
            .worldCulturalHeritage(placeCulture.getWorldCulturalHeritage())
            .worldNaturalHeritage(placeCulture.getWorldNaturalHeritage())
            .worldRecordHeritage(placeCulture.getWorldRecordHeritage())
            .type(placeCulture.getType())
            .build();
    }
}
