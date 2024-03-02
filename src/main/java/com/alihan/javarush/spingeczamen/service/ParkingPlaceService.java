package com.alihan.javarush.spingeczamen.service;

import com.alihan.javarush.spingeczamen.entity.ParkingPlace;

import java.util.List;

public interface ParkingPlaceService {
    ParkingPlace createParkingPeople (ParkingPlace parkingPlace);
    List<ParkingPlace> getParkingPeopleByPlace (ParkingPlace parkingPlace);
    ParkingPlace updateParkingPeople (ParkingPlace parkingPlace);
    List<ParkingPlace> allFreePlaces (ParkingPlace parkingPlace);
    void deleteParkingPeople (ParkingPlace parkingPlace);
    List<ParkingPlace> getAllParkingPlaces (ParkingPlace parkingPlace);
    ParkingPlace reservationFreePlace (ParkingPlace parkingPlace1);

}