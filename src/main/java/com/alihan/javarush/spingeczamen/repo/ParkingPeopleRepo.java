package com.alihan.javarush.spingeczamen.repo;

import com.alihan.javarush.spingeczamen.entity.ParkingPeople;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingPeopleRepo extends JpaRepository<ParkingPeople, Long> {
}
