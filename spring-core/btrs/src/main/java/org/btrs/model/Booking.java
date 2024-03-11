package org.btrs.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity(name = "BookingTable")
public class Booking {
	@Id
	@GeneratedValue
	private Integer bookingId;
	private String source;
	private String destination;
	private String email;
	public Booking() {
		
	}
	
	public Booking(Integer bookingId, String source, String destination, String email) {
		super();
		this.bookingId = bookingId;
		this.source = source;
		this.destination = destination;
		this.email = email;
	}

	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", source=" + source + ", destination=" + destination + ", email="
				+ email + "]";
	}


}
