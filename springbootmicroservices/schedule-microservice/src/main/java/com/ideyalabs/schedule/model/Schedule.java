package com.ideyalabs.schedule.model;

import com.ideyalabs.schedule.dto.RouteResponseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue
    private int scheduleId;
    private int routeNumber;
    private String source;
    private String destination;
    private int distance;
    private int duration;
    private int flightNumber;
    private String flightName;
    private String flightType;
    private int totalSeats;
    private int ticketPrice;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private int seatsAvailable;
}
