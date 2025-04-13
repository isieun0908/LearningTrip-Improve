package com.lssinni.LearningTrip_Improve.service;

import com.lssinni.LearningTrip_Improve.Repository.PlaceRepository;
import com.lssinni.LearningTrip_Improve.domain.Place;
import com.lssinni.LearningTrip_Improve.dto.PlaceDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {

    private final PlaceRepository placeRepository;

    @Autowired
    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public PlaceDto getPlace(long place_id) {
        Place place = placeRepository.findById(place_id)
            .orElseThrow(() -> new EntityNotFoundException("Not Found"));
        return PlaceDtoFactory.createPlaceDto(place);
    }
}
