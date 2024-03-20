package com.ideyalabs.schedule.service;

import com.ideyalabs.schedule.dto.FlightResponseDto;
import com.ideyalabs.schedule.dto.RouteResponseDto;
import com.ideyalabs.schedule.dto.ScheduleDto;
import com.ideyalabs.schedule.model.Flight;
import com.ideyalabs.schedule.model.Route;
import com.ideyalabs.schedule.model.Schedule;
import com.ideyalabs.schedule.repository.FlightRepository;
import com.ideyalabs.schedule.repository.RouteRepository;
import com.ideyalabs.schedule.repository.ScheduleRespository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ScheduleServiceImpl implements ScheduleService{
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ScheduleRespository scheduleRespository;
   @Autowired
   private FlightRepository flightRepository;
   @Autowired
   private RouteRepository routeRepository;
    @Override
    public Schedule createSchedule(ScheduleDto scheduleDto) {
            //i need to talk to roure service /route-api/v1/routes/rId
            //routeDto
       RouteResponseDto routeResponseDto=restTemplate.getForObject("http://localhost:9001/route-api/v1/routes/"+scheduleDto.getRouteNumber(), RouteResponseDto.class);
       FlightResponseDto flightResponseDto=restTemplate.getForObject("http://localhost:9000/flight-api/v1/flights/"+scheduleDto.getFlightNumber(), FlightResponseDto.class);
        System.out.println(routeResponseDto);
        System.out.println(flightResponseDto);
        //i need to talk to roure service /flight-api/v1/flights/fId
        //flightDto
        Flight f=flightRepository.save(modelMapper.map(flightResponseDto, Flight.class));
        Route r=routeRepository.save(modelMapper.map(routeResponseDto, Route.class));
        Schedule schedule=new Schedule();
        schedule.setRoute(r);
        schedule.setFlight(f);
        schedule.setDepartureDateTime(scheduleDto.getDepartureDataTime());
        schedule.setArrivalDateTime(scheduleDto.getArrivaldatetime());
        schedule.setSeatsAvailable(schedule.getSeatsAvailable());

       return  scheduleRespository.save(schedule);

    }
}
