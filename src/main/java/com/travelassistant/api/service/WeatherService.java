package com.travelassistant.api.service;

import com.travelassistant.api.entities.Weather;
import com.travelassistant.api.repositories.WeatherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Service("weatherService")
public class WeatherService {
    private final WeatherRepository weatherRepository;


    public List<Weather> getNxNyWeatherOnDate(Integer nx, Integer ny, String onDate) {

        return weatherRepository.findByNxAndNyAndFcstDateAndFcstTime(nx, ny, onDate, "1200");
    }

}
