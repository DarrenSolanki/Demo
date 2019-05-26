package com.classes;

public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if((validModel.equals("verna"))|| (validModel.equals("i20"))){
			this.model = model;
		}
		else {
			this.model = "Unknown";
		}
	}
	
	//	public String getModel() {
	//		return this.model;
	//	}
	
	public void setCar(int doors, int wheels, String model, String engine, String colour) {
		this.doors = doors;
		this.wheels = wheels;
		this.model = model;
		this.engine = engine;
		this.colour = colour;
		
	}
	
	public String getCarModel() {
		return this.model;
		
	}
	
	public String getCarColour() {
		return this.colour;
		
	}
	
	public String getCarEngine() {
		return this.engine;
		
	}
	
	public int getCarWheels() {
		return this.wheels;
		
	}
	
	public int getCarDoors() {
		return this.doors;
		
	}
	
	
	
	

}
