package com.lssinni.LearningTrip_Improve.domain;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;

@Entity  @Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Place {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    protected Long id;

    @Column(length = 100, nullable = false)
    protected String name;          // 이름

    @Column(length = 10000)
    protected String description;   // 설명

    @Column(length = 100)
    protected String imageURL1;          // 이미지 1

    @Column(length = 100)
    protected String imageURL2;          // 이미지 2

    @Column(length = 100)
    protected String address;       // 주소

    @Column(length = 20)
    protected Double latitude;      // 위도

    @Column(length = 20)
    protected Double longitude;     // 경도

    @Column(length = 100)
    protected String tel;           // 전화번호

    @Column(length = 200)
    protected String info;          // 안내

    @Column(length = 200)
    protected String restDate;      // 쉬는날

    @Column(length = 700)
    protected String useTime;       // 이용시간

    @Column(length = 300)
    protected String parking;       // 주차정보

    protected Boolean babyCarriage;     // 유모차대여 정보

    protected Boolean pet;              // 애완동물 가능 여부

    protected Boolean textbook;         // 교과서 여부

    public abstract String getType();
}
