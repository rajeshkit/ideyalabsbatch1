package com.ideyalabs.schedule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightResponseDto {
    private int flightNumber;
    private String flightName;
    private String flightType;
    private int totalSeats;
    private int ticketPrice;
}
