package org.btrs.service;

import java.util.List;

import org.btrs.dao.BookingDao;
import org.btrs.dto.BookingDto;
import org.btrs.entity.Booking;
import org.modelmapper.ModelMapper;
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
	public BookingDto createBooking(BookingDto booking) {
		// TODO Auto-generated method stub
		Booking booking1=new Booking(null,booking.getSource() , booking.getDestination(), booking.getEmail(), booking.getDate());
		Booking b = bookingDao.createBooking(booking1);
		return new BookingDto(b.getBookingId(),b.getSource(),b.getDestination(),b.getEmail(),b.getDate());
	}

	@Override
	public BookingDto getBookingById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingDto> getAllBookings(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
