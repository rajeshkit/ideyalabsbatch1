package org.btrs.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.btrs.model.Booking;
import org.btrs.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BookingController {
	
	
	private BookingService bookingService;
	
	
	@Autowired	
	public BookingController(BookingService bookingService) {
		super();
		this.bookingService = bookingService;
	}
	@RequestMapping(value = "/openbookingform",method = RequestMethod.GET)
	public String openBooking() {
		System.out.println("Booking controller is called");
		return "bookingform";
	}
	@RequestMapping(value = "/book",method = RequestMethod.POST)
	public String makeBooking(HttpServletRequest request,Model model) throws ParseException {
		System.out.println("make Booking controller is called");
		String from=request.getParameter("from");
		String to=request.getParameter("to");
		String email=request.getParameter("email");
		String journeydate=request.getParameter("journeydate");
	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Booking booking=new Booking(null, from, to, email);
		System.out.println(booking);
		model.addAttribute("myObj", bookingService.createBooking(booking));
		return "bookingstatus";
	}
}
