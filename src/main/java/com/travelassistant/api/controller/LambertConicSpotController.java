package com.travelassistant.api.controller;


import com.travelassistant.api.entities.LambertConicSpot;
import com.travelassistant.api.service.LambertConicSpotService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/districts")
public class LambertConicSpotController {
    private final LambertConicSpotService lambertConicSpotService;

    @GetMapping("")
    public List<LambertConicSpot> getDistricts(@RequestParam String searchString) {
        log.info("%" + HtmlUtils.htmlUnescape(searchString) + "%");

        List<LambertConicSpot> spots = lambertConicSpotService.findSpots("%" + HtmlUtils.htmlUnescape(searchString) + "%");

        return spots;
    }

    @GetMapping("/closest")
    public List<LambertConicSpot> getClosestDistricts(@RequestParam Double lat, @RequestParam Double lng) {
        log.info("get closest district");
        return lambertConicSpotService.findClosestSpot(lat, lng);
    }
}
