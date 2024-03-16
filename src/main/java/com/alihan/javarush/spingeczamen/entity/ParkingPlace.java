package com.alihan.javarush.spingeczamen.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Null;
import lombok.*;
import org.hibernate.internal.build.AllowNonPortable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "parking_places")
@Setter
@Getter
public class ParkingPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numberParkingPlace;
    private String statusParkingPlace;
    private String type;

    private boolean reserved;
    private boolean released;
}
