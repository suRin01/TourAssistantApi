package com.travelassistant.api.repositories;

import com.travelassistant.api.entities.Spot;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SpotRepository extends JpaRepository<Spot, Integer> {
    List<Spot> findByAreacodeIs(String areacode);

//    List<Spot> findByMapxBetweenAndMapyBetween(Double mapxStart, Double mapxEnd, Double mapyStart, Double mapyEnd);

    List<Spot> findByMapxIsBetween(Double mapxStart, Double mapxEnd);

    @Query("select s from Spot s where s.mapx between ?1 and ?2 and s.mapy between ?3 and ?4 order by s.readcount asc")
    List<Spot> findByMapxBetweenAndMapyBetween(Double mapxStart, Double mapxEnd, Double mapyStart, Double mapyEnd);

    @Query("select s from Spot s where s.mapx between ?1 and ?2 and s.mapy between ?3 and ?4 order by s.readcount")
    List<Spot> findByMapxBetweenAndMapyBetweenOrderByReadcountAsc(Double mapxStart, Double mapxEnd, Double mapyStart, Double mapyEnd, Pageable pageable);


}