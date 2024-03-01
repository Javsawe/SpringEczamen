package com.alihan.javarush.spingeczamen.service;

import com.alihan.javarush.spingeczamen.dto.ParkingPeopleDto;
import com.alihan.javarush.spingeczamen.entity.ParkingPeople;
import com.alihan.javarush.spingeczamen.entity.ParkingPlace;

import java.util.List;

public interface ParkingPeopleService {
boolean reservationFreePlace (ParkingPlace parkingPlace1);
List<ParkingPeople> getAll ();
List<ParkingPeople> getAllFreePlace (ParkingPlace parkingPlace);
void deleteById (Long id);
Long numberOfParking (Integer numberOfPlace);
ParkingPlace liberationReservatingPlace (ParkingPlace parkingPlace2);
List<ParkingPlace> filterByListFreePlace (ParkingPlace parkingPlace);
}
