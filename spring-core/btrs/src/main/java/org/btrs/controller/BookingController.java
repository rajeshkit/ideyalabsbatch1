package org.btrs.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import org.btrs.dto.BookingDto;
import org.btrs.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String openBooking(Model model) {
		System.out.println("Booking controller is called");
		model.addAttribute("book", new BookingDto());
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
		
		BookingDto bookingDto=new BookingDto(null,from,to,email,sdf.parse(journeydate));
		System.out.println(bookingDto);
		model.addAttribute("myObj", bookingService.createBooking(bookingDto));
		return "bookingstatus";
	}
}
