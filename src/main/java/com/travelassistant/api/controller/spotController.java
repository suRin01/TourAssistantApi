package com.travelassistant.api.controller;

import com.travelassistant.api.entities.Spot;
import com.travelassistant.api.service.SpotService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/spots")
public class spotController {
    private final SpotService spotService;


    @GetMapping("/{areacode}")
    public List<Spot> getSpotsByAreaCode(@PathVariable String areacode) {
        return spotService.findByAreacode(areacode);
    }

    @GetMapping("")
    public List<Spot> getSpotByGeolocationPositionBased(@RequestParam Double lngStart, @RequestParam Double lngEnd, @RequestParam Double latStart, @RequestParam Double latEnd) {
        System.out.println(lngStart);
        System.out.println(lngEnd);
        System.out.println(latStart);
        System.out.println(latEnd);
        List<Spot> tempList = spotService.findByLngLat(lngStart, lngEnd, latStart, latEnd);
        System.out.println(tempList);
        return tempList;
    }
}
