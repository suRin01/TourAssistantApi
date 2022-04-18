package com.travelassistant.api.repositories;

import com.travelassistant.api.entities.LambertConicSpot;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LambertConicSpotRepository extends JpaRepository<LambertConicSpot, Integer> {
    @Query("select l from LambertConicSpot l where l.stage1 like ?1 or l.stage2 like ?2 or l.stage3 like ?3")
    List<LambertConicSpot> findByStage1LikeOrStage2LikeOrStage3Like(String stage1, String stage2, String stage3, Pageable pageable);

    @Query(value = "select * from lambert_conic_spots order by (pow(ABS(lat - ?1), 2) + pow(ABS(lng - ?2), 2)) limit 1;", nativeQuery = true)
    List<LambertConicSpot> findByLatAndLng(Double lat, Double lng);


}