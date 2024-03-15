package org.mtrs.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BusDto {
	private String travelsName;
	private String source;
	private String destination;
	private int cost;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date journeyDate;
	

}
