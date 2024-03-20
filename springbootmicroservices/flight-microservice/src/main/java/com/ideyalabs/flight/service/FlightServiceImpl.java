package com.ideyalabs.flight.service;

import com.ideyalabs.flight.dto.FlightDto;
import com.ideyalabs.flight.model.Flight;
import com.ideyalabs.flight.repository.FlightRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlightServiceImpl implements FlightService{
    @Autowired
    private FlightRepository flightRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public FlightDto addFlight(FlightDto flight) {
        Flight f = flightRepository.save(modelMapper.map(flight, Flight.class));
        return modelMapper.map(f,FlightDto.class);
    }

    @Override
    public FlightDto findFlightByNumber(int flightNumber) {
        Optional<Flight> flightOptional = flightRepository.findById(flightNumber);
        if(flightOptional.isEmpty()){
            return null;
        }
        return modelMapper.map(flightOptional.get(), FlightDto.class);
    }

    @Override
    public List<FlightDto> getAllFlights() {
        List<Flight> flightList = flightRepository.findAll();
        List<FlightDto> flightDtoList=flightList.stream().map(e->modelMapper.map(e,FlightDto.class)).collect(Collectors.toList());
        return flightDtoList;
    }
}
