package com.travelassistant.api.repositories;

import com.travelassistant.api.entities.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather, Integer> {
}