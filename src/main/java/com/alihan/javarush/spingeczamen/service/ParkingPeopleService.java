package com.alihan.javarush.spingeczamen.service;

import com.alihan.javarush.spingeczamen.dto.ParkingPeopleDto;
import com.alihan.javarush.spingeczamen.entity.ParkingPeople;
import com.alihan.javarush.spingeczamen.entity.ParkingPlace;

import java.util.List;
import java.util.Optional;

public interface ParkingPeopleService {
        List<ParkingPeople> getAllParkingPeople();
        List<ParkingPeople> getParkingPeopleById(Long id);
        ParkingPeople saveParkingPeople(ParkingPeople parkingPeople);


    void deleteParkingPeople(Long id);
    }

