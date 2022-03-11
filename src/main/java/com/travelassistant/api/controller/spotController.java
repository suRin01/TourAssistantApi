package com.travelassistant.api.controller;

import com.travelassistant.api.entities.Spot;
import com.travelassistant.api.service.SpotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/spots/")
public class spotController {
    private final SpotService spotService;


    @GetMapping("{areacode}")
    public List<Spot> getSpotsByAreaCode( @PathVariable String areacode ) {
        return spotService.findByAreacode(areacode);
    }
}
