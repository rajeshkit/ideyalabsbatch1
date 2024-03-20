package com.ideyalabs.schedule.controller;

import com.ideyalabs.schedule.dto.ScheduleDto;
import com.ideyalabs.schedule.model.Schedule;
import com.ideyalabs.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule-api/v1")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;
    @PostMapping("/schedules")
    public Schedule createSchedule(@RequestBody ScheduleDto scheduleDto){
       return scheduleService.createSchedule(scheduleDto);
    }
}
