package com.travelassistant.api.service;

import com.travelassistant.api.entities.Spot;
import com.travelassistant.api.repositories.SpotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service("spotService")
public class SpotService {
    private final SpotRepository spotRepository;

    public List<Spot> findByAreacode( String areacode ) {
        List<Spot> entity = spotRepository.findByAreacodeIs(areacode);

        return entity;
    }
}
