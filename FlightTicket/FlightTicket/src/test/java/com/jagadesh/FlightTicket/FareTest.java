package com.jagadesh.FlightTicket;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.dao.*;
import com.model.*;

import junit.framework.Assert;
@SpringBootTest
class FareTest {
	
	@Autowired
	FareService service;
	
	@Test
	void contextLoads() {
	
	}
	
	@Test
	void testAdd() {
		
		Fare fare=new Fare();
		fare.setBusinessFare(200);
		fare.setEconomyFare(150);
		fare.setPremiumFare(1000);
		service.add(fare);
		Fare fare1=service.find(fare.getId());
		
//	  Assert.assertEquals(200,fare1.getBusinessFare());
//	  Assert.assertEquals(150,fare1.getEconomyFare());
//	  Assert.assertEquals(1000,fare1.getPremiumFare());
	}
	
	@Test
	void testModifyFare() {
		
		Fare fare=new Fare();
		fare.setBusinessFare(122);
		fare.setEconomyFare(551);
		fare.setPremiumFare(3121);
		service.add(fare);
		fare.setEconomyFare(600);
		service.modifyFare(fare);
		Assert.assertEquals(true, service.modifyFare(fare));
	}
	@Test
	void testDelete() {
		Fare fare=new Fare();
		fare.setBusinessFare(125);
		fare.setEconomyFare(515);
		fare.setPremiumFare(3250);
		service.add(fare);
		service.delete(6);
		Assert.assertNull(service.find(6));
		
	}

	@Test
	void testFind() {
		
		Fare fare=new Fare();
		fare.setBusinessFare(700);
		fare.setEconomyFare(550);
		fare.setPremiumFare(3000);
		service.add(fare);
		Fare status1=service.find(fare.getId());
		Assert.assertEquals(700d, status1.getBusinessFare());
	} 

	@Test
	void testFindAll() {
		Fare fare=new Fare();
		fare.setBusinessFare(250d);
		fare.setEconomyFare(150);
		fare.setPremiumFare(1500);
		service.add(fare);
		Fare fare1=new Fare();
		fare1.setBusinessFare(3000);
		fare1.setEconomyFare(1000);
		fare1.setPremiumFare(5000);
		service.add(fare1);
		Fare fare2=new Fare();
		fare2.setBusinessFare(1250);
		fare2.setEconomyFare(1150);
		fare2.setPremiumFare(2555);
		service.add(fare2);
		List<Fare> farelist=service.findAll();
		farelist.get(0).getBusinessFare();
		Assert.assertEquals(farelist.get(0).getBusinessFare(), 200d);
	}

}
