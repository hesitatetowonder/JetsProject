package com.sd.jets;

import java.util.Scanner;

public class Menu {
	Scanner kb = new Scanner(System.in);
	JoesAirplaneSalvage jet = new JoesAirplaneSalvage();
	public void start(){
		System.out.println("Welcome to Mission control");
		System.out.println("Please select from the menu below");
		System.out.println("1. List Fleet");
		System.out.println("2. View fastest Jet");
		System.out.println("3. View Jet with longest range");
		System.out.println("4. Add a jet to fleet");
		System.out.println("5. quit");
		int choice = kb.nextInt();

		switch(choice){
		case 1 : {
			jet.list();
			break;
			}
		case 2 : {
			jet.fastest();
			break;
		}
		case 3 : {
			jet.longest();
			break;
			}
		case 4 : {	
			jet.add();
				System.out.println("Your jet has been added to the fleet for this session, " 
									+ "if your have an actual jet you would like to see " 
									+  "added permanently please see the ");
				System.out.println("fleet manager for assistance.");
				
				break;
			}
		case 5: {
			System.out.println("Have a nice day");
			return;
			}
		}
		start();
	}
}