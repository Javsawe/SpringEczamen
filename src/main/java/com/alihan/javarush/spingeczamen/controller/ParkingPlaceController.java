package com.alihan.javarush.spingeczamen.controller;

import com.alihan.javarush.spingeczamen.entity.ParkingPlace;
import com.alihan.javarush.spingeczamen.service.ParkingPlaceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/parkingT")
@AllArgsConstructor
public class ParkingPlaceController {
    private final ParkingPlaceService parkingPlaceService;

    @PostMapping("/createParkingPlace")
    public ParkingPlace saveParkingPlace(ParkingPlace parkingPlace) {
        return parkingPlaceService.saveParkingPlace(parkingPlace);
    }


    @DeleteMapping("/deleteParkingPlaceById")
    public void deleteParkingPlace(Long id) {
        parkingPlaceService.deleteParkingPlace(id);
    }


    @GetMapping("/getAllParkingPlaces")
    public List<ParkingPlace> getAllParkingPlaces() {
        return parkingPlaceService.getAllParkingPlaces();
    }

    @GetMapping("/getParkingPlacesById")
    public Optional<ParkingPlace> getParkingPlaceById(Long id) {
        return parkingPlaceService.getParkingPlaceById(id);
    }

    @PostMapping("/reserveParkingPlace")
    public ResponseEntity<ResponseModel> reserveParkingPlace(@RequestParam int numberParkingPlace) {
        boolean success = parkingPlaceService.reserveParkingPlace(numberParkingPlace);
        if (success) {
            ResponseModel response = new ResponseModel("Место успешно забронировано.", HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), true);
            return ResponseEntity.ok().body(response);
        } else {
            String errorMessage = "Не удалось забронировать место. Возможно, оно уже забронировано или не существует.";
            ResponseModel response = new ResponseModel(errorMessage, HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), false);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("/releaseParkingPlace")
    public ResponseEntity<ResponseModel> releaseParkingPlace(@RequestParam int numberParkingPlace) {
        boolean success = parkingPlaceService.releaseParkingPlace(numberParkingPlace);
        if (success) {
            ResponseModel response = new ResponseModel("Место успешно освобождено.", HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), true);
            return ResponseEntity.ok().body(response);
        } else {
            String errorMessage = "Не удалось освободить место. Место с номером " + numberParkingPlace + " не существует или уже свободно.";
            ResponseModel response = new ResponseModel(errorMessage, HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), false);
            return ResponseEntity.badRequest().body(response);
        }
    }


    @GetMapping("/filterParkingPlaceByTypes")
    public ResponseEntity<List<ParkingPlace>> filterParkingSpotsByType(@RequestParam String type) {
        List<ParkingPlace> filteredSpots = parkingPlaceService.filterParkingPlacesByType(type);
        if (!filteredSpots.isEmpty()) {
            System.out.println("Фильтрация успешна. Найдено " + filteredSpots.size() + " парковочных мест типа " + type + ".");
            return ResponseEntity.ok().body(filteredSpots);
        } else {
            System.out.println("Фильтрация не успешна. Не найдено парковочных мест типа " + type + ".");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
