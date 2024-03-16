package com.alihan.javarush.spingeczamen.repo;

import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingPlaceRepo extends JpaRepository<ParkingPlace, Long> {
    ParkingPlace findByNumberParkingPlace(int numberParkingPlace);

    List<ParkingPlace> findByType(String type);
}
