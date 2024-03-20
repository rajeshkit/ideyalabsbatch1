package com.ideyalabs.route.controller;

import com.ideyalabs.route.dto.RouteDto;
import com.ideyalabs.route.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/route-api/v1")
public class RouteController {
    @Autowired
    private RouteService routeService;
    @PostMapping("/routes")
    public RouteDto addRoute(@RequestBody RouteDto route) {
        return routeService.addRoute(route);
    }
    @GetMapping("/routes/{routeNumber}")
    public RouteDto findRouteByNumber(@PathVariable int routeNumber){
        return routeService.findRouteByNumber(routeNumber);
    }
    @GetMapping("/routes")
    public List<RouteDto> getAllRoutes(){
        return routeService.getAllRoutes();
    }
}
