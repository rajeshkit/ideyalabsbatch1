package org.btrs.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingDto{
	private Integer bookingId;
	private String source;
	private String destination;
	private String email;
	private Date date;
	
}
