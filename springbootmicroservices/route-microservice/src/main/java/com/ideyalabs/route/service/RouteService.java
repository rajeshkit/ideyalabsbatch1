package com.ideyalabs.route.service;

import com.ideyalabs.route.dto.RouteDto;

import java.util.List;

public interface RouteService {
    public RouteDto addRoute(RouteDto route);
    public RouteDto findRouteByNumber(int routeNumber);
    public List<RouteDto> getAllRoutes();
}
