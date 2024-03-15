package org.mtrs.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mtrs.controller.BusController;
import org.mtrs.entity.BusEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
@Repository
public class BusDaoImpl implements BusDao {
	private static final Logger logger=LoggerFactory.getLogger(BusController.class);
	@Override
	public BusEntity addBus(BusEntity busEntity) {
		Configuration configuration=new Configuration();
        configuration.configure("app.hibernate.config.xml");
        logger.trace("hibernate config is loaded");
        SessionFactory sessionFactory=configuration.buildSessionFactory(); //3 connections
        logger.trace("hibernate config is crea");
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.persist(busEntity);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
		return busEntity;
	}

	@Override
	public BusEntity findBusById(int busId) {
		
		return null;
	}

}
