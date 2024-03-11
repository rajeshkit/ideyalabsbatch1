package org.btrs.service;

import java.util.List;

import org.btrs.dao.BookingDao;
import org.btrs.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookingServiceImpl implements BookingService {
	
	private BookingDao bookingDao;
	
	@Autowired
	public BookingServiceImpl(BookingDao bookingDao) {
		super();
		this.bookingDao = bookingDao;
	}

	@Override
	public Booking createBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingDao.createBooking(booking);
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
