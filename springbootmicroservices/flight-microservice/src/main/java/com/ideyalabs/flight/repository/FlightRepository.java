package com.ideyalabs.flight.repository;

import com.ideyalabs.flight.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository
        extends JpaRepository<Flight,Integer> {
}
