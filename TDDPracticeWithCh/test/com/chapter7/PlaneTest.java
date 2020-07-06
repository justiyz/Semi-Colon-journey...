package com.chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaneTest {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void createPlane() {
		Plane dreamliner = new Plane();
		dreamliner.setName("Semicolon Dreamliner");
		assertNotNull(dreamliner.getName());
		assertEquals("Semicolon Dreamliner", dreamliner.getName());
	}
	
	@Test
	void createPlaneWithName() {
		Plane airbus = new Plane("Semicolon Airbus");
		assertNotNull(airbus.getName());
		assertEquals("Semicolon Airbus", airbus.getName());
	}
	
	@Test
	void reserveSeat() {
		Plane airPeace = new Plane("Air Peace");
		int[] planeSeats = new int[5];
		airPeace.setSeats(planeSeats);
		Passenger john = new Passenger();
		john.setId(100);
		SeatReservationManager agent = new SeatReservationManager();
		
		assertEquals(0, airPeace.getSeats()[0]);
		assertEquals(0, john.getSeatNumber());
		agent.reserveSeat(john, airPeace);
		
		assertEquals(1, john.getSeatNumber());
		assertEquals(john.getId(), airPeace.getSeats()[0]);
	}
	
	@Test
	void isSeatAvailableWithEmptyPlane() {
		SeatReservationManager agent = new SeatReservationManager();
		Plane airPeace = new Plane("Air Peace");
		int[] planeSeats = new int[5];
		airPeace.setSeats(planeSeats);
		boolean result = agent.isSeatAvailable(airPeace);
		assertTrue(result);
	}
	
	@Test
	void isSeatAvailableWithNullSeat() {
		SeatReservationManager agent = new SeatReservationManager();
		Plane airPeace = new Plane("Air Peace");
		boolean result = agent.isSeatAvailable(airPeace);
		assertFalse(result);
	}
	
	@Test
	void isSeatAvailableWithFullPlane() {
		SeatReservationManager agent = new SeatReservationManager();
		Plane airPeace = new Plane("Air Peace");
		int[] planeSeats = {1,1,1,1,1};
		airPeace.setSeats(planeSeats);
		boolean result = agent.isSeatAvailable(airPeace);
		assertFalse(result);
	}
	
	@Test
	void isSeatAvailableWithPartialAvailability() {
		SeatReservationManager agent = new SeatReservationManager();
		Plane airPeace = new Plane("Air Peace");
		int[] planeSeats = {1,1,0,1,1};
		airPeace.setSeats(planeSeats);
		boolean result = agent.isSeatAvailable(airPeace);
		assertTrue(result);
	}
}