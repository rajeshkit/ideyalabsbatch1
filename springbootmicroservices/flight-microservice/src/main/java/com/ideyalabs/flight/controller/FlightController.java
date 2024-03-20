package com.ideyalabs.flight.controller;

import com.ideyalabs.flight.dto.FlightDto;
import com.ideyalabs.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight-api/v1")
public class FlightController {
    @Autowired
    private FlightService flightService;
    @PostMapping(value = "/flights")
    public FlightDto addFlight(@RequestBody FlightDto flight){
        return flightService.addFlight(flight);
    }
    @GetMapping("/flights/{flightId}")
    public FlightDto findFlightByNumber(@PathVariable("flightId") int flightNumber){
        return flightService.findFlightByNumber(flightNumber);
    }
    @GetMapping("/flights")
    public List<FlightDto> getAllFlights(){
        return flightService.getAllFlights();
    }
}
