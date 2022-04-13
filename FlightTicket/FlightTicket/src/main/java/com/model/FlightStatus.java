package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class FlightStatus {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Max(value=300)
    @Min(value=0)
	private int remainingEconomySeats;
	
	@NotNull
	@Max(value=300)
    @Min(value=0)
	private int remainingPremiumSeats;
	
	@NotNull
	@Max(value=300)
    @Min(value=0)
	private int remainingBusinessSeats;
	
	public FlightStatus() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRemainingEconomySeats() {
		return remainingEconomySeats;
	}

	public void setRemainingEconomySeats(int remainingEconomySeats) {
		this.remainingEconomySeats = remainingEconomySeats;
	}

	public int getRemainingPremiumSeats() {
		return remainingPremiumSeats;
	}

	public void setRemainingPremiumSeats(int remainingPremiumSeats) {
		this.remainingPremiumSeats = remainingPremiumSeats;
	}

	public int getRemainingBusinessSeats() {
		return remainingBusinessSeats;
	}

	public void setRemainingBusinessSeats(int remainingBusinessSeats) {
		this.remainingBusinessSeats = remainingBusinessSeats;
	}
	
	

}
