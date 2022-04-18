package com.travelassistant.api.service;

import com.travelassistant.api.entities.LambertConicSpot;
import com.travelassistant.api.repositories.LambertConicSpotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service("lambertConicSpotService")
public class LambertConicSpotService {
    private final LambertConicSpotRepository lambertConicSpotRepository;

    public List<LambertConicSpot> findSpots(String searchString) {
        Pageable limitFifty = PageRequest.of(0, 10);
        return lambertConicSpotRepository.findByStage1LikeOrStage2LikeOrStage3Like(searchString, searchString, searchString, limitFifty);
    }

    public List<LambertConicSpot> findClosestSpot(Double lat, Double lng) {
        Pageable limitOne = PageRequest.of(0, 1);
        return lambertConicSpotRepository.findByLatAndLng(lat, lng);

    }


}
