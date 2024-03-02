package com.alihan.javarush.spingeczamen.controller;

import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import com.alihan.javarush.spingeczamen.service.ParkingPlaceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkingT")
@AllArgsConstructor
public class ParkingPlaceController {
    private final ParkingPlaceService parkingPlaceService;

    @GetMapping("/getPlace")
    public List<ParkingPlace> getAllParkingPlaces(ParkingPlace parkingPlace) {
        return parkingPlaceService.getAllParkingPlaces(parkingPlace);
    }

        @PostMapping("/createParkingPeople")
        public ParkingPlace createParkingPeople (ParkingPlace parkingPlace)  {
            return parkingPlaceService.createParkingPeople(parkingPlace);
        }

        @GetMapping("/getParkingPeopleByPlace")
        public List<ParkingPlace> getParkingPeopleByPlace(ParkingPlace parkingPlace) {
            return parkingPlaceService.getParkingPeopleByPlace(parkingPlace);
        }

        @PutMapping("/updateParkingPeople")
        public ParkingPlace updateParkingPeople(ParkingPlace parkingPlace) {
            return parkingPlaceService.updateParkingPeople(parkingPlace);
        }

        @PostMapping("/allFreePlaces")
        public List<ParkingPlace> allFreePlaces(ParkingPlace parkingPlace) {
            return parkingPlaceService.allFreePlaces(parkingPlace);
        }

        @DeleteMapping("/deleteParkingPeople")
        public void deleteParkingPeople(ParkingPlace parkingPlace) {
            parkingPlaceService.deleteParkingPeople(parkingPlace);
        }

        @PostMapping("/reservationFreePlace")
        public ParkingPlace reservationFreePlace(ParkingPlace parkingPlace1) {
            return parkingPlaceService.reservationFreePlace(parkingPlace1);
        }
    }
