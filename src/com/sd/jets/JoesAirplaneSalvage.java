package com.sd.jets;
// 1 Mile Per Hour = 0.001303 Mach

import java.util.Arrays;
import java.util.Scanner;

public class JoesAirplaneSalvage {
	Scanner kb = new Scanner(System.in);
	Pilot ace = new Pilot();
	Jet f = new Jet();
	double mph;
	double mach = mph * .001303;
	int counter = 5;
	Jet[] hangar = new Jet[100];	
	{

	hangar[0] = new Jet("Gulfstream IV-SP", 675, 4890, 6700000);
	hangar[1] = new Jet("Honda HA-420 HondaJet", 483, 1358, 45000000);
	hangar[2] = new Jet("Learjet 45XR", 535, 2300, 5500000);
	hangar[3] = new Jet("Beechcraft Premier IA", 526, 1645, 2100000);
	hangar[4] = new Jet("Cessna Citation CJ4", 519 , 2259, 7350000);
	}
	
	public JoesAirplaneSalvage() {
		super();
	}



	public void list(){
		System.out.println("The fleet consist of :");
		for(int j = 0; j < 5; j++){
			hangar[j].pilot = ace.makePilot();
		}
		for(int i = 0; i < hangar.length; i++){
			if(hangar[i] == null){
				break;
			}
			System.out.println(hangar[i]);
		}
	}	

	public void fastest(){
		for (int i = 0; i< hangar.length; i++){
			if (hangar[i] == null){
				break;
			}
			if (hangar[i].getSpeed() > f.getSpeed()){
				f = hangar[i];
			}
		}
		System.out.println("The fastest jet is : " + f);
	}
	
	public void longest(){
		for (int i = 0; i< hangar.length; i++){
			if (hangar[i] == null){
				break;
			}
			if (hangar[i].getDistance() > f.getDistance()){
				f = hangar[i];
			}
		}
		System.out.println("The jet with the longest range is : " + f);
	}

	public void add(){
		System.out.println("I need the info for your new jet: ");
		System.out.print("Make/Model of jet : ");
		String model = kb.next();
		System.out.print("Speed(in mph) : ");
		double speed = kb.nextDouble();
		System.out.print("Range : ");
		double distance = kb.nextDouble();
		System.out.print("Price : ");
		int price = kb.nextInt();
		System.out.print("Please hire a pilot for your Jet. If you have your own pilot,");
		System.out.println("please enter his/her name below.  Or choose from one of our");
		System.out.print("Steve, Rob, Aaron, Kris and Cole.  Enter name : ");
		String pilot = kb.next();
		
		
		hangar[counter] = new Jet(model, speed, distance, price);	
		hangar[counter].setPilot(pilot);
		System.out.println(hangar[counter]);
		counter++;
	}



	@Override
	public String toString() {
		return "JoesAirplaneSalvage [mph=" + mph + ", mach=" + mach + ", a=" 
				+ ", hangar=" + Arrays.toString(hangar) + "]";
	}
}
	




