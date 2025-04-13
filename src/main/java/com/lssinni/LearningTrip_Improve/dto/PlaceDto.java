package com.lssinni.LearningTrip_Improve.dto;

import com.lssinni.LearningTrip_Improve.domain.PlaceTour;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class PlaceDto {

    protected Long id;

    protected String type;

    protected String name;          // 이름

    protected String description;   // 설명

    protected String imageURL1;          // 이미지 1

    protected String imageURL2;          // 이미지 2

    protected String address;       // 주소

    protected Double latitude;      // 위도

    protected Double longitude;     // 경도

    protected String tel;           // 전화번호

    protected String info;          // 안내

    protected String restDate;      // 쉬는날

    protected String useTime;       // 이용시간

    protected String parking;       // 주차정보

    protected Boolean babyCarriage;     // 유모차대여 정보

    protected Boolean pet;              // 애완동물 가능 여부

    protected Boolean textbook;         // 교과서 여부
}
