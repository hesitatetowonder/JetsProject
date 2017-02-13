package com.sd.jets;

public class Pilot {
    String randomPilot;
	
    public String makePilot(){
		int i =	(int)(1 + (Math.random()*5));
		switch(i){
		case 1 :{
			randomPilot = "Steve";
			break;
		}
		case 2 :{
			randomPilot = "Rob";
			break;
		}
		case 3 :{
			randomPilot = "Aaron";
			break;
		}
		case 4 :{
			randomPilot = "Kris";
			break;
		}
		case 5 :{
			randomPilot ="Cole";
			break;
		}
		}
		return randomPilot;
	}



	@Override
	public String toString() {
		return "Pilot is " + randomPilot;
	}



}
