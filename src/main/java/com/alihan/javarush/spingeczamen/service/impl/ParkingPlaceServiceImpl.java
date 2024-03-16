package com.alihan.javarush.spingeczamen.service.impl;

import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import com.alihan.javarush.spingeczamen.repo.ParkingPlaceRepo;
import com.alihan.javarush.spingeczamen.service.ParkingPlaceService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ParkingPlaceServiceImpl implements ParkingPlaceService {
    private final ParkingPlaceRepo parkingPlaceRepo;
    private Map<Integer, Boolean> parkingPlaces = new HashMap<>();
    private List<ParkingPlace> parkingPlaces2;

    @Override
    public ParkingPlace saveParkingPlace(ParkingPlace parkingPlace) {
        return parkingPlaceRepo.save(parkingPlace);
    }


    @Override
    public void deleteParkingPlace(Long id) {
        parkingPlaceRepo.deleteById(id);
    }

    @Override
    public boolean reserveParkingPlace(int numberParkingPlace) {
        ParkingPlace parkingPlace1 = parkingPlaceRepo.findByNumberParkingPlace(numberParkingPlace);
        if (parkingPlace1 != null && !parkingPlace1.isReserved()) {
            parkingPlace1.setReserved(true);
            parkingPlaceRepo.save(parkingPlace1);
            System.out.println("Место с номером " + numberParkingPlace + " успешно забронировано.");
            return true;
        } else {
            System.out.println("Место с номером " + numberParkingPlace + " уже забронировано или не существует.");
            return false;
        }
    }

    @Override
    public boolean releaseParkingPlace(int numberParkingPlace) {
        ParkingPlace parkingPlace2 = parkingPlaceRepo.findByNumberParkingPlace(numberParkingPlace);
        if (parkingPlace2 != null && !parkingPlace2.isReleased()) {
            parkingPlace2.setReleased(true);
            parkingPlaceRepo.save(parkingPlace2);
            System.out.println("Место с номером " + numberParkingPlace + " успешно освобожденно.");
            return true;
        } else {
            System.out.println("Место с номером " + numberParkingPlace + " уже освобожденно или не существует.");
            return false;
        }
    }


    @Override
    public List<ParkingPlace> filterParkingPlacesByType(String type) {
        if (parkingPlaces2 == null) {
            parkingPlaces2 = initializeParkingSpots(type);
        }

        List<ParkingPlace> filteredSpots = new ArrayList<>();
        for (ParkingPlace spot : parkingPlaces2) {
            if (spot.getType().equalsIgnoreCase(type)) {
                filteredSpots.add(spot);
            }
        }

        if (!filteredSpots.isEmpty()) {
            System.out.println("Фильтрация успешна. Найдено " + filteredSpots.size() + " парковочных мест типа " + type + ".");
        } else {
            System.out.println("Фильтрация не успешна. Не найдено парковочных мест типа " + type + ".");
        }

        return filteredSpots;
    }



    @Override
    public List<ParkingPlace> initializeParkingSpots(String type2) {
        ParkingPlace parkingPlace3 = new ParkingPlace();
       parkingPlaceRepo.findByType(type2);
       parkingPlace3.setType(type2);
        System.out.println("Фильтрация успешна");
        return new ArrayList<>();
    }


    @Override
    public List<ParkingPlace> getAllParkingPlaces() {
        return parkingPlaceRepo.findAll();
    }

    @Override
    public Optional<ParkingPlace> getParkingPlaceById(Long id) {
        return parkingPlaceRepo.findById(id);
    }
}