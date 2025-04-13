package com.lssinni.LearningTrip_Improve.controller;

import com.lssinni.LearningTrip_Improve.dto.PlaceDto;
import com.lssinni.LearningTrip_Improve.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceController {

    private final PlaceService placeService;

    @Autowired
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("/place/{place_id}")
    @ResponseBody
    public PlaceDto getPlace(@PathVariable(name = "place_id") long place_id) {
        PlaceDto placeDto = placeService.getPlace(place_id);
        System.out.println(placeDto);
        return placeDto;
    }
}
