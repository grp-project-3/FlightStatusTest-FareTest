package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Fare {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private double economyFare;
	
	@NotNull
	private double premiumFare;
	
	@NotNull
	private double businessFare;
	
	public Fare() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getEconomyFare() {
		return economyFare;
	}

	public void setEconomyFare(double economyFare) {
		this.economyFare = economyFare;
	}

	public double getPremiumFare() {
		return premiumFare;
	}

	public void setPremiumFare(double premiumFare) {
		this.premiumFare = premiumFare;
	}

	public double getBusinessFare() {
		return businessFare;
	}

	public void setBusinessFare(double businessFare) {
		this.businessFare = businessFare;
	}
	
	

}
