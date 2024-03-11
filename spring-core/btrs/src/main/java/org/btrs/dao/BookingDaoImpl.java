package org.btrs.dao;

import java.util.List;

import org.btrs.model.Booking;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
@Component
public class BookingDaoImpl implements BookingDao{

	@Override
	public Booking createBooking(Booking booking) {
		Configuration configuration=new Configuration();
        configuration.configure("app.hibernate.config.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory(); //3 connections
        Session session=sessionFactory.openSession();
        session.beginTransaction();
         session.persist(booking);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    
		return null;
	}

	@Override
	public Booking getBookingById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getAllBookings(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
