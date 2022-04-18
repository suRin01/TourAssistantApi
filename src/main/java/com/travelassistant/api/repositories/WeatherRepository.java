package com.travelassistant.api.repositories;

import com.travelassistant.api.entities.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherRepository extends JpaRepository<Weather, Integer> {
    List<Weather> findByNxAndNyAndFcstDateAndFcstTime(Integer nx, Integer ny, String fcstDate, String fcstTime);

}