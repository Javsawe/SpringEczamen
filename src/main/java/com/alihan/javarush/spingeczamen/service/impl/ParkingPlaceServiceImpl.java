package com.alihan.javarush.spingeczamen.service.impl;

import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import com.alihan.javarush.spingeczamen.repo.ParkingPlaceRepo;
import com.alihan.javarush.spingeczamen.service.ParkingPlaceService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ParkingPlaceServiceImpl implements ParkingPlaceService {
    private final ParkingPlaceRepo parkingPlaceRepo;
    @Override
    public ParkingPlace createParkingPeople(ParkingPlace parkingPlace) {
        return parkingPlaceRepo.save(parkingPlace);
    }

    @Override
    public List<ParkingPlace> getParkingPeopleByPlace(ParkingPlace parkingPlace) {
        return parkingPlaceRepo.findAll();
    }

    @Override
    public ParkingPlace updateParkingPeople(ParkingPlace parkingPlace) {
        return parkingPlaceRepo.save(parkingPlace);
    }

    @Override
    public List<ParkingPlace> allFreePlaces(ParkingPlace parkingPlace) {
        return parkingPlaceRepo.findAll();
    }

    @Override
    public void deleteParkingPeople(ParkingPlace parkingPlace) {
         parkingPlaceRepo.delete(parkingPlace);
    }

    @Override
    public List<ParkingPlace> getAllParkingPlaces(ParkingPlace parkingPlace) {
        return parkingPlaceRepo.findAll();
    }

    @Override
    public ParkingPlace reservationFreePlace(ParkingPlace parkingPlace1) {
        return parkingPlaceRepo.save(parkingPlace1);
    }
}