package com.alihan.javarush.spingeczamen.controller;

import com.alihan.javarush.spingeczamen.entity.ParkingPeople;
import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import com.alihan.javarush.spingeczamen.service.ParkingPeopleService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class ParkingPeopleController {
    private final ParkingPeopleService parkingPeopleService;

    @PostMapping("/createUser")
    public ParkingPeople saveParkingPeople(ParkingPeople parkingPeople) {
        return parkingPeopleService.saveParkingPeople(parkingPeople);
    }

    @GetMapping("/getAllParkingUser")
    public List<ParkingPeople> getAllParkingPeople() {
        return parkingPeopleService.getAllParkingPeople();
    }

    @DeleteMapping("/deleteParkingUserById")
    public void deleteParkingPeople(Long id) {
        parkingPeopleService.deleteParkingPeople(id);
    }

    @GetMapping("/getParkingUserById")
    public List<ParkingPeople> getParkingPeopleById(Long id) {
        return parkingPeopleService.getParkingPeopleById(id);
    }
}
