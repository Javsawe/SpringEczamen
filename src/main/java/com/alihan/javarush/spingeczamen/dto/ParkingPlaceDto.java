package com.alihan.javarush.spingeczamen.dto;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingPlaceDto {
    private Long id;
    private Integer numberParkingPlace;
    private String statusParkingPlace;
    private String specificType;
}
