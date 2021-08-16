package main;

import java.util.Scanner;

public class Converter {
	
	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main (String[ ]args) {
		int menuSelection = 0;
// for nested switch//		int subMenuSelection = 0;
		
		
		while (menuSelection != 4) {	
		
			
		System.out.println("Hello what would you like to convert?");
		System.out.println("Select a number option");		
		System.out.println("1.USD to EURO");
		System.out.println("2.Farenheit to Celcius");
		System.out.println("3.Feet to Meters");
		System.out.println("4. Quit");
		System.out.println("-----------------" +"\n");
		
		menuSelection = scan.nextInt();
		
		
		switch (menuSelection) {
		case 1:
			
			System.out.println("Enter a dollar amount to be converted");
		
			System.out.println("1. USD to Euro");
			//to be used for nested switch//	System.out.println("2. Return to Main Menu");
				
					
			double conversionAMT = scan.nextFloat();
			double euroConversion = conversionAMT * .85;
					
				System.out.println(euroConversion +" Euros");
						
			break;
		
		
		
		case 2:
			System.out.println("Enter Farenheit degree to be converted");
			
			 
			 double degreeAMT = scan.nextDouble();
			 double farenheitConversion = ((degreeAMT - 32) * .5556);
						
				System.out.println(farenheitConversion +" Celsius");
			
			
			break;
		
		case 3:
			System.out.println("Enter Feet measurement to be converted");
			
			double feetLngth=scan.nextFloat();
			double meterConversion = (feetLngth/ 3.281);
			
				System.out.println (meterConversion + "m");
			
			break;
			
		case 4:
			System.out.println("Thank you for using the Converter application");
			break;
		
		default:
			System.out.println("Invalid option, try something else...");
			
			
		
			
		}
		

	}
	
	
	

	
}
	}
