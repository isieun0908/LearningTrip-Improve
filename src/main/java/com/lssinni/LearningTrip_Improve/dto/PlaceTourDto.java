package com.lssinni.LearningTrip_Improve.dto;

import com.lssinni.LearningTrip_Improve.domain.Place;
import com.lssinni.LearningTrip_Improve.domain.PlaceTour;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class PlaceTourDto extends PlaceDto {

    private String discount;        // 할인정보

    private String parkingFee;      // 주차요금

    private String useFee;          // 이용요금

    private String spendTime;       // 소요시간

    public static PlaceTourDto toDto(PlaceTour placeTour) {
        return PlaceTourDto.builder()
            .id(placeTour.getId())
            .name(placeTour.getName())
            .description(placeTour.getDescription())
            .imageURL1(placeTour.getImageURL1())
            .imageURL2(placeTour.getImageURL2())
            .address(placeTour.getAddress())
            .latitude(placeTour.getLatitude())
            .longitude(placeTour.getLongitude())
            .tel(placeTour.getTel())
            .info(placeTour.getInfo())
            .restDate(placeTour.getRestDate())
            .useTime(placeTour.getUseTime())
            .parking(placeTour.getParking())
            .babyCarriage(placeTour.getBabyCarriage())
            .pet(placeTour.getPet())
            .textbook(placeTour.getTextbook())
            .discount(placeTour.getDiscount())
            .parkingFee(placeTour.getParkingFee())
            .useFee(placeTour.getUseFee())
            .spendTime(placeTour.getSpendTime())
            .type(placeTour.getType())
            .build();
    }
}
