package com.alihan.javarush.spingeczamen.controller;

import com.alihan.javarush.spingeczamen.entity.ParkingPeople;
import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import com.alihan.javarush.spingeczamen.service.ParkingPeopleService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class ParkingPeopleController {
    private final ParkingPeopleService parkingPeopleService;

    @PostMapping("/create")
    public ParkingPeople numberOfParking(Integer numberOfPlace, ParkingPeople parkingPeople) {
        return parkingPeopleService.numberOfParking(numberOfPlace, parkingPeople);
    }

    @GetMapping("/get")
    public List<ParkingPeople> getAll(ParkingPeople parkingPeople) {
        return parkingPeopleService.getAll(parkingPeople);
    }
    @DeleteMapping("/delete")
    public void deleteById(Long id) {
        parkingPeopleService.deleteById(id);
    }
}
