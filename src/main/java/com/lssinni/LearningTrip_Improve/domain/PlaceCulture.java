package com.lssinni.LearningTrip_Improve.domain;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity @Getter
@DiscriminatorValue("culture")
public class PlaceCulture extends Place {

    @Column(length = 200)
    private String experienceAge;       // 체험가능연령

    @Column(length = 200)
    private String experienceInfo;      // 체험안내

    private Boolean worldCulturalHeritage;    // 세계문화유산 유무

    private Boolean worldNaturalHeritage;    // 세계자연유산 유무

    private Boolean worldRecordHeritage;     // 세계기록유산 유무

    @Override
    public String getType() {
        return "culture";
    }
}
