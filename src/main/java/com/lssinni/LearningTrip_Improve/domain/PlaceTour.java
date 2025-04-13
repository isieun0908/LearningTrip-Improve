package com.lssinni.LearningTrip_Improve.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import lombok.Getter;

@Entity @Getter
@DiscriminatorValue("tour")
public class PlaceTour extends Place{

    @Column(length = 600)
    private String discount;        // 할인정보

    @Column(length = 600)
    private String parkingFee;      // 주차요금

    @Column(length = 1600)
    private String useFee;          // 이용요금

    @Column(length = 200)
    private String spendTime;       // 소요시간

    @Override
    public String getType() {
        return "tour";
    }
}
