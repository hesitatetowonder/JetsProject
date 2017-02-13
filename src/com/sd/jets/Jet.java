package com.sd.jets;

public class Jet{
	private String model;
	private double speed, distance;
	private int price;
	protected String pilot;

	public Jet(String model, double speed, double distance, int price){
		this.model = model;
		this.speed = speed * 0.00130332;
		this.distance = distance;
		this.price = price;
		}

	public Jet(){

	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed * 0.00130332;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}

	@Override
	public String toString() {
		return "A " + model + ", with a speed of mach " + speed + ", a range of " + distance 
				+ " and cost " + price + " the current pilot of this jet is "
				+ pilot;
	}	
}
