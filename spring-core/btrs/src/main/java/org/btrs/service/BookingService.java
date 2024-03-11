package org.btrs.service;

import java.util.List;

import org.btrs.model.Booking;

public interface BookingService {
	public Booking createBooking(Booking booking);
	public Booking getBookingById(int bookId);
	public List<Booking> getAllBookings(int bookId);
}
