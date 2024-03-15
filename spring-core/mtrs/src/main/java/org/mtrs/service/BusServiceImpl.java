package org.mtrs.service;


import org.modelmapper.ModelMapper;
import org.mtrs.controller.BusController;
import org.mtrs.dao.BusDao;
import org.mtrs.dto.BusDto;
import org.mtrs.entity.BusEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BusServiceImpl implements BusService {
	private static final Logger logger=LoggerFactory.getLogger(BusController.class);
	@Autowired
	private BusDao busDao;
	
	@Override	
	public BusDto addBus(BusDto busDto) {
		logger.debug("busdto is recieved from controller");
		ModelMapper modelMapper=new ModelMapper();
		BusEntity busEntity=modelMapper.map(busDto, BusEntity.class);
		logger.info("busdto is mapped to entity");
		BusEntity bus=busDao.addBus(busEntity);
//		if(bus==null) {
//			logger.error("bus Entity is not persisted");
//		}
		return modelMapper.map(bus, BusDto.class);
	}

	@Override
	public BusDto findByBusId(int busId) {
		// TODO Auto-generated method stub
		return null;
	}

}
