package com.ideyalabs.schedule.service;

import com.ideyalabs.schedule.dto.FlightResponseDto;
import com.ideyalabs.schedule.dto.RouteResponseDto;
import com.ideyalabs.schedule.dto.ScheduleDto;
import com.ideyalabs.schedule.model.Schedule;
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

    @Override
    public Schedule createSchedule(ScheduleDto scheduleDto) {
       RouteResponseDto routeResponseDto=restTemplate.getForObject("http://localhost:9001/route-api/v1/routes/"+scheduleDto.getRouteNumber(), RouteResponseDto.class);
       FlightResponseDto flightResponseDto=restTemplate.getForObject("http://localhost:9000/flight-api/v1/flights/"+scheduleDto.getFlightNumber(), FlightResponseDto.class);
        System.out.println(routeResponseDto);
        System.out.println(flightResponseDto);

        Schedule schedule=new Schedule();
        schedule.setRouteNumber(routeResponseDto.getRouteNumber());
        schedule.setSource(routeResponseDto.getSource());
        schedule.setDestination(routeResponseDto.getDestination());
        schedule.setDistance(routeResponseDto.getDistance());
        schedule.setDuration(routeResponseDto.getDuration());

        schedule.setFlightNumber(flightResponseDto.getFlightNumber());
        schedule.setFlightName(flightResponseDto.getFlightName());
        schedule.setFlightType(flightResponseDto.getFlightType());
        schedule.setTotalSeats(flightResponseDto.getTotalSeats());
        schedule.setTicketPrice(flightResponseDto.getTicketPrice());
        schedule.setDepartureDateTime(scheduleDto.getDepartureDataTime());
        schedule.setArrivalDateTime(scheduleDto.getArrivaldatetime());
        schedule.setSeatsAvailable(schedule.getSeatsAvailable());

       return  scheduleRespository.save(schedule);

    }
}
