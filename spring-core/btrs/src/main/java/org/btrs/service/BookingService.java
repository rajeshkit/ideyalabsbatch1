package org.btrs.service;

import java.util.List;

import org.btrs.dto.BookingDto;

public interface BookingService {
	public BookingDto createBooking(BookingDto booking);
	public BookingDto getBookingById(int bookId);
	public List<BookingDto> getAllBookings(int bookId);
}
