package com.lssinni.LearningTrip_Improve.service;

import com.lssinni.LearningTrip_Improve.domain.Place;
import com.lssinni.LearningTrip_Improve.domain.PlaceCulture;
import com.lssinni.LearningTrip_Improve.domain.PlaceTour;
import com.lssinni.LearningTrip_Improve.dto.PlaceCultureDto;
import com.lssinni.LearningTrip_Improve.dto.PlaceDto;
import com.lssinni.LearningTrip_Improve.dto.PlaceTourDto;

public class PlaceDtoFactory {
    public static PlaceDto createPlaceDto(Place place) {
        if (place instanceof PlaceTour) {
            return PlaceTourDto.toDto((PlaceTour) place);
        } else if (place instanceof PlaceCulture) {
            return PlaceCultureDto.toDto((PlaceCulture) place);
        } else {
            throw new IllegalArgumentException("Unknown Place type");
        }
    }
}
