package com.sd.jets;

public class Jet{
	protected String model;
	protected double speed, distance;
	protected int cap;
	protected Pilot bob = new Pilot();

	public Jet(String model, double speed, double distance, int cap){
		this.model = model;
		this.speed = speed * .0013;
		this.distance = distance;
		this.cap = cap;
		}

		public Jet(){}
	
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
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public Pilot getBob() {
		return bob;
	}

	public void setBob(Pilot bob) {
		this.bob = bob;
	}

	@Override
	public String toString() {
		return "A " + model + ", with a speed of " + speed + ", a range of " + distance 
				+ " and can hold up to " + cap + "people. "+ "the current pilot of this jet is "
				+ bob;
	}	
}
