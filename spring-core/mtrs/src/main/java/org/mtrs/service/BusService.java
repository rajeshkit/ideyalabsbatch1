package org.mtrs.service;

import org.mtrs.dto.BusDto;

public interface BusService {
	public BusDto addBus(BusDto busDto);
	public BusDto findByBusId(int busId);

}
