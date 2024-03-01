package com.alihan.javarush.spingeczamen.service.impl;

import com.alihan.javarush.spingeczamen.dto.ParkingPeopleDto;
import com.alihan.javarush.spingeczamen.entity.ParkingPeople;
import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import com.alihan.javarush.spingeczamen.repo.ParkingPeopleRepo;
import com.alihan.javarush.spingeczamen.service.ParkingPeopleService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ParkingPeopleServiceImpl implements ParkingPeopleService {
    private final ParkingPeopleRepo parkingPeopleRepo;

    @Override
    public boolean reservationFreePlace(ParkingPlace parkingPlace1) {
        try {
            parkingPeopleRepo.equals(parkingPlace1);
            return true;
        } catch (Exception e) {
            log.error(e.getStackTrace().toString());
            return false;
        }
    }

    @Override
    public List<ParkingPeople> getAll() {
        return parkingPeopleRepo.findAll();
    }

    @Override
    public List<ParkingPeople> getAllFreePlace(ParkingPlace parkingPlace) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        parkingPeopleRepo.deleteById(id);
    }

    @Override
    public Long numberOfParking(Integer numberOfPlace) {
        ParkingPlace parkingPlace = new ParkingPlace();
        return parkingPeopleRepo.save(parkingPlace);
    }

    @Override
    public ParkingPlace liberationReservatingPlace(ParkingPlace parkingPlace2) {
        return null;
    }

    @Override
    public List<ParkingPlace> filterByListFreePlace(ParkingPlace parkingPlace) {
        return null;
    }
}
