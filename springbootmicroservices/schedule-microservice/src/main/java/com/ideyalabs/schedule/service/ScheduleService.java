package com.ideyalabs.schedule.service;

import com.ideyalabs.schedule.dto.ScheduleDto;
import com.ideyalabs.schedule.model.Schedule;

public interface ScheduleService {
    public Schedule createSchedule(ScheduleDto scheduleDto);
}
