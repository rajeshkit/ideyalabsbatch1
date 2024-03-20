package com.ideyalabs.schedule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDto {
    private int flightNumber;
    private int routeNumber;
    private LocalDateTime departureDataTime;
    private LocalDateTime arrivaldatetime;
    private int availableSeats;
}