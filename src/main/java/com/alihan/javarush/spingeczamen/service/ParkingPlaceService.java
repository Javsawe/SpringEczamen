package com.alihan.javarush.spingeczamen.service;

import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import springfox.documentation.service.ResponseMessage;

import java.util.List;
import java.util.Optional;

public interface ParkingPlaceService {
    List<ParkingPlace> initializeParkingSpots(String type2);

    List<ParkingPlace> getAllParkingPlaces();
    Optional<ParkingPlace> getParkingPlaceById(Long id);
    ParkingPlace saveParkingPlace(ParkingPlace parkingPlace);
    void deleteParkingPlace(Long id);

    boolean reserveParkingPlace(int numberParkingPlace);
    boolean releaseParkingPlace(int numberParkingPlace);

    List<ParkingPlace> filterParkingPlacesByType(String type);

}