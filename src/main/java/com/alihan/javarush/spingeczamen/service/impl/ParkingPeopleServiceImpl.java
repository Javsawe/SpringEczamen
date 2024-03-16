package com.alihan.javarush.spingeczamen.service.impl;
import com.alihan.javarush.spingeczamen.entity.ParkingPeople;
import com.alihan.javarush.spingeczamen.repo.ParkingPeopleRepo;
import com.alihan.javarush.spingeczamen.service.ParkingPeopleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


@Service
@Slf4j
@RequiredArgsConstructor
public class ParkingPeopleServiceImpl implements ParkingPeopleService {
    private final ParkingPeopleRepo parkingPeopleRepo;

    @Override
    public ParkingPeople saveParkingPeople(ParkingPeople parkingPeople) {
        return parkingPeopleRepo.save(parkingPeople);
    }

    @Override
    public List<ParkingPeople> getAllParkingPeople() {
        return parkingPeopleRepo.findAll();
    }

    @Override
    public void deleteParkingPeople(Long id) {
        parkingPeopleRepo.deleteById(id);
    }



    @Override
    public List<ParkingPeople> getParkingPeopleById(Long id) {
        return parkingPeopleRepo.findAllById(Collections.singleton(id));
    }
}
