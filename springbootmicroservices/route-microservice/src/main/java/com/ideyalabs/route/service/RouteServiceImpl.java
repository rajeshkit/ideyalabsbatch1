package com.ideyalabs.route.service;

import com.ideyalabs.route.dto.RouteDto;
import com.ideyalabs.route.model.Route;
import com.ideyalabs.route.repository.RouteRespository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RouteServiceImpl implements RouteService{
    @Autowired
    private RouteRespository routeRespository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public RouteDto addRoute(RouteDto route) {
        Route route1 = routeRespository.save(modelMapper.map(route, Route.class));
        return modelMapper.map(route1, RouteDto.class);
    }

    @Override
    public RouteDto findRouteByNumber(int routeNumber) {
        Optional<Route> routeOptional=routeRespository.findById(routeNumber);
        if(routeOptional.isEmpty()){
            return null;
        }
        return  modelMapper.map(routeOptional.get(),RouteDto.class);
    }

    @Override
    public List<RouteDto> getAllRoutes() {
        List<Route> routeList=routeRespository.findAll();
        List<RouteDto> routeDtoList =routeList.stream().map(e->modelMapper.map(e, RouteDto.class)).collect(Collectors.toList());
        return routeDtoList;
    }
}
