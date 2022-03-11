package com.travelassistant.api.controller;

import com.travelassistant.api.entities.Spot;
import com.travelassistant.api.service.SpotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/weather/")
public class weatherController {
    private final SpotService spotService;

    @GetMapping("{areacode}")
    public List<Spot> getSpotsByAreaCode( @PathVariable String areacode ) {
        return spotService.findByAreacode(areacode);
    }
}
