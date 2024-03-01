package com.alihan.javarush.spingeczamen.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingPeopleDto {
    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String carNumber;
}
