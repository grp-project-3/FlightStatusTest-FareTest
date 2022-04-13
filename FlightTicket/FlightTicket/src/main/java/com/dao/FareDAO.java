package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Fare;
import com.model.FlightStatus;

@Repository
public interface FareDAO {
	
	public void add(Fare fare);
	public Fare findFare(int id);
	public List<Fare> findAllFare();
	public boolean modifyFare(Fare fare);
	public boolean deleteFare(int id);
	
}