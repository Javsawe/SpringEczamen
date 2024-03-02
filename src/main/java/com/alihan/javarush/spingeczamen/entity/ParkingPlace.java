package com.alihan.javarush.spingeczamen.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.internal.build.AllowNonPortable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "parking")
public class ParkingPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer numberParkingPlace;
    private String statusParkingPlace;
    private String specificType;
    }
