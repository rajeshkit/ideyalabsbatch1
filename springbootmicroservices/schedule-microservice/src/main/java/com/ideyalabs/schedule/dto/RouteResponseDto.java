package com.ideyalabs.schedule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteResponseDto {
    private int routeNumber;
    private String source;
    private String destination;
    private int distance;
    private int duration;
}
