package com.alihan.javarush.spingeczamen.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ParkingPlaceStatus {
        FREE("Свободно"),
        OCCUPIED("Занято")
    ;
        String DESCRIPTION;
    }
