package com.sd.jets;
// 1 Mile Per Hour = 0.001303 Mach

import java.util.Arrays;
import java.util.Scanner;

public class JoesAirplaneSalvage extends Jet{
	Scanner kb = new Scanner(System.in);
	Pilot ace = new Pilot();
	double mph;
	double mach = mph * .001303;
	int counter = 5;
	Jet[] hangar = new Jet[100];	
	{

	hangar[0] = new Jet("Gulfstream IV-SP", 675, 4890, 12);
	hangar[1] = new Jet("Honda HA-420 HondaJet", 483, 1358, 6);
	hangar[2] = new Jet("Learjet 45XR", 535, 2300, 9);
	hangar[3] = new Jet("Beechcraft Premier IA", 526, 1645, 6);
	hangar[4] = new Jet("Cessna Citation CJ4", 519 , 2259, 9);
	}
	
	public JoesAirplaneSalvage() {
		super();
	}



	public void list(){
		for(int i = 0; i < hangar.length; i++){
			if(hangar[i] == null){
				break;
			}
			hangar[i].pilot = ace.makePilot();
			System.out.println(hangar[i]);
		}
	}	

	public void fastest(){
		Jet f = new Jet();
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
		Jet f = new Jet();
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
		model = kb.next();
		System.out.print("Speed(in mph) : ");
		speed = kb.nextDouble();
		System.out.print("Range : ");
		distance = kb.nextDouble();
		System.out.print("Capacity(people - pilot) : ");
		cap = kb.nextInt();
		
		hangar[counter] = new Jet(model, speed, distance, cap);
		System.out.println(hangar[counter]);
		counter++;
	}



	@Override
	public String toString() {
		return "JoesAirplaneSalvage [mph=" + mph + ", mach=" + mach + ", a=" 
				+ ", hangar=" + Arrays.toString(hangar) + "]";
	}
}
	




