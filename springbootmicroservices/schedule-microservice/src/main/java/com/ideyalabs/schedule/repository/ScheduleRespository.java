package com.ideyalabs.schedule.repository;

import com.ideyalabs.schedule.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRespository extends JpaRepository<Schedule,Integer> {
}
