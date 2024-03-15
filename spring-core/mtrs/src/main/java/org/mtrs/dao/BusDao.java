package org.mtrs.dao;

import org.mtrs.entity.BusEntity;

public interface BusDao {
	public BusEntity addBus(BusEntity busEntity);
	public BusEntity findBusById(int busId);
}
