 package com.chapter7;

import java.math.BigInteger;

public class SeatReservationManager {

	public void reserveSeat(Passenger flyer, Plane flight) {
		if(isSeatAvailable(flight)) {
			for(int i = 0; i < flight.getSeats().length; i++) {
				if(flight.getSeats()[i] == BigInteger.ZERO.intValue()) {
					flight.getSeats()[i] = flyer.getId();
					flyer.setSeatNumber(i + 1);
					break;
				}
			}
		}
	}
	
	public boolean isSeatAvailable(Plane flight) {
		boolean result = false;
		if(flight.getSeats() != null) {
			for(int i = 0; i < flight.getSeats().length; i++) {
				if(flight.getSeats()[i] == BigInteger.ZERO.intValue()) {
					result = true;
				}
			}
		}
		return result;
	}

}
