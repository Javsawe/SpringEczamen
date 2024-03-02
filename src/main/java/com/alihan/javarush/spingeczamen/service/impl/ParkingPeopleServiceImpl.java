package com.alihan.javarush.spingeczamen.service.impl;
import com.alihan.javarush.spingeczamen.entity.ParkingPeople;
import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import com.alihan.javarush.spingeczamen.repo.ParkingPeopleRepo;
import com.alihan.javarush.spingeczamen.service.ParkingPeopleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class ParkingPeopleServiceImpl implements ParkingPeopleService {
    private final ParkingPeopleRepo parkingPeopleRepo;

    @Override
    public List<ParkingPeople> getAll(ParkingPeople parkingPeople) {
        return parkingPeopleRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        parkingPeopleRepo.deleteById(id);
    }

    @Override
    public ParkingPeople numberOfParking(Integer numberOfPlace, ParkingPeople parkingPeople) {
        return parkingPeopleRepo.save(parkingPeople);
    }
    }
