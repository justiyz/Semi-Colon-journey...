package com.chapter7;

public class Plane {

	private String name;
	private int[] seats;
	
	public Plane(String name) {
		this.name = name;
	}

	public Plane(String name, int[] seats) {
		// constructor overload
		this(name);
		this.seats = seats;
	}

	public Plane() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getSeats() {
		return seats;
	}

	public void setSeats(int[] seats) {
		this.seats = seats;
	}
	
	
}



