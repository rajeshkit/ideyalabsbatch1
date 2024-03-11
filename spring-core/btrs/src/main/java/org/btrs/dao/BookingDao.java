package org.btrs.dao;

import java.util.List;

import org.btrs.model.Booking;

public interface BookingDao {
	public Booking createBooking(Booking booking);
	public Booking getBookingById(int bookId);
	public List<Booking> getAllBookings(int bookId);
}
