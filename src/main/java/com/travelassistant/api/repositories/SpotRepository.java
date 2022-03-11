package com.travelassistant.api.repositories;

import com.travelassistant.api.entities.Spot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpotRepository extends JpaRepository<Spot, Integer> {
    List<Spot> findByAreacodeIs( String areacode );
}