package com.ideyalabs.flight.service;

import com.ideyalabs.flight.dto.FlightDto;

import java.util.List;

public interface FlightService {
    public FlightDto addFlight(FlightDto flight);
    public FlightDto findFlightByNumber(int flightNumber);
    public List<FlightDto> getAllFlights();
}
