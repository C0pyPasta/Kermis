package Kermis.com.timo;

public class Main {
	public static void main(String[] args) {
		Kermis kermis = new Kermis();
		
	}
}

class Kermis {
	
	Kermis() {
		System.out.println("Trucks start rolling in...");
		
		System.out.println("Attractions are being set up...");
		Attractie bumperCars = new Ultrabumpercars();
		bumperCars.setName("Ultrabumpercars");
		bumperCars.setPrice(2.50);
		bumperCars.setSurfaceArea(40.00);
		
		Attractie turboSpin = new Turbospin();
		turboSpin.setName("Turbospin");
		turboSpin.setPrice(2.50);
		turboSpin.setSurfaceArea(30.00);
		
		// je moet hier nog de andere attracties aanmaken
		
		System.out.println("Drawers are being filled...");
		System.out.println("Lights on...");
		System.out.println("Welcome to the Crazy Carnival!");
		
		
		
	}
}