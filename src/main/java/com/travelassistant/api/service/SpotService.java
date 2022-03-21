package com.travelassistant.api.service;

import com.travelassistant.api.entities.Spot;
import com.travelassistant.api.repositories.SpotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service("spotService")
public class SpotService {
    private final SpotRepository spotRepository;

    public List<Spot> findByAreacode(String areacode) {
        List<Spot> entity = spotRepository.findByAreacodeIs(areacode);

        return entity;
    }

    public List<Spot> findByLngLat(Double lngStart, Double lngEnd, Double latStart, Double latEnd) {
        Pageable limitFifty = PageRequest.of(0, 50);
        return spotRepository.findByMapxBetweenAndMapyBetweenOrderByReadcountAsc(lngStart, lngEnd, latStart, latEnd, limitFifty);
    }

}
