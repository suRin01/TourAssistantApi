package com.travelassistant.api.controller;

import com.travelassistant.api.entities.Spot;
import com.travelassistant.api.entities.Weather;
import com.travelassistant.api.service.SpotService;
import com.travelassistant.api.service.WeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/weather")
public class weatherController {
    private final WeatherService weatherService;

    @GetMapping("")
    public List<Weather> getWeatherOnDate(@RequestParam Integer nx, @RequestParam Integer ny, @RequestParam String ondate) {
        log.info(nx + " " + ny + " " + ondate);
        return weatherService.getNxNyWeatherOnDate(nx, ny, ondate);
    }
}
