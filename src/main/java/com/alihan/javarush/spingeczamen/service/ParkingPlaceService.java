package com.alihan.javarush.spingeczamen.service;

import com.alihan.javarush.spingeczamen.entity.ParkingPeople;
import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface ParkingPlaceService {
    ParkingPeople createParkingPeople (ParkingPeople parkingPeople,
                                       String carNumber, String name,
                                       String surname, String phoneNumber);
    ParkingPeople getParkingPeopleByPlace (ParkingPlace parkingPlace);
    ParkingPeople updateParkingPeople (ParkingPeople parkingPeople);
    List<ParkingPlace> allFreePlaces (ParkingPlace parkingPlace);
    void deleteParkingPeople (ParkingPeople parkingPeople);

}
