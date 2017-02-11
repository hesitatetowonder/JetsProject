package com.sd.jets;
// 1 Mile Per Hour = 0.001303 Mach

import java.util.Arrays;

public class JoesAirplaneSalvage extends Jet{
	double mph;
	double mach = mph * .001303;

	Jet a = new Jet("Gulfstream IV-SP", 675.19, 4890.81, 12);
	Jet b = new Jet("Gulfstream IV-SP", 675.19, 4890.81, 12);
	Jet c = new Jet("Gulfstream IV-SP", 675.19, 4890.81, 12);
	Jet d = new Jet("Gulfstream IV-SP", 675.19, 4890.81, 12);
	Jet e = new Jet("Gulfstream IV-SP", 675.19, 4890.81, 12);

	Jet[] hangar = new Jet[]{a,b,c,d,e, null, null, null, null, null};
	

	public JoesAirplaneSalvage() {
		super();
	}



	public void list(){
		for(int i = 0; i < hangar.length; i++){
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

	public void add(String model, double speed, double distance, int cap){
		Jet g = new Jet(model, speed, distance, cap);
		System.out.println(g);
	}



	@Override
	public String toString() {
		return "JoesAirplaneSalvage [mph=" + mph + ", mach=" + mach + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d
				+ ", e=" + e + ", hangar=" + Arrays.toString(hangar) + "]";
	}
	
	
}




