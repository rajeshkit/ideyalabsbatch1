package org.mtrs.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusEntity {
	@Id
	@GeneratedValue
	private int busId;
	private String travelsName;
	private String source;
	private String destination;
	private int cost;
	private Date journeyDate;
}
