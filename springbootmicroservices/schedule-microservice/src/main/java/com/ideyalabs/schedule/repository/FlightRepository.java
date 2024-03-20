package com.ideyalabs.schedule.repository;

import com.ideyalabs.schedule.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Integer> {
}
