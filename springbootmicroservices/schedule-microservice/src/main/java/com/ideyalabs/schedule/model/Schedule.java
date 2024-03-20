package com.ideyalabs.schedule.model;

import com.ideyalabs.schedule.dto.RouteResponseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue
    private int scheduleId;
    @OneToOne(cascade = CascadeType.ALL)
    private Route route;
    @OneToOne(cascade = CascadeType.ALL)
    private Flight flight;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private int seatsAvailable;
}
