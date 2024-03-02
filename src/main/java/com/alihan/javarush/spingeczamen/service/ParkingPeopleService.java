package com.alihan.javarush.spingeczamen.service;

import com.alihan.javarush.spingeczamen.dto.ParkingPeopleDto;
import com.alihan.javarush.spingeczamen.entity.ParkingPeople;
import com.alihan.javarush.spingeczamen.entity.ParkingPlace;

import java.util.List;

public interface ParkingPeopleService {
List<ParkingPeople> getAll (ParkingPeople parkingPeople);
void deleteById (Long id);
ParkingPeople numberOfParking (Integer numberOfPlace, ParkingPeople parkingPeople);
}
