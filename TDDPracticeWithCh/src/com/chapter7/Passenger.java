package com.chapter7;

public class Passenger {
	private int id;
	private String name;
	private int seatNumber;

	public Passenger(String name) {
		this.name = name;
	}

	public Passenger() {}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
}

