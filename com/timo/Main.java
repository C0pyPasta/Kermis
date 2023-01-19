package Kermis.com.timo;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Kermis kermis = new Kermis();
		
	}
}

class Kermis {
	
	Scanner input = new Scanner(System.in);
	
	Kermis() {
		System.out.println("Attractions are being set up...");
		Attractie bumperCars = new Ultrabumpercars();
		bumperCars.setName("Ultra Bumpercars");
		bumperCars.setPrice(2.50);
		bumperCars.setSurfaceArea(40.00);
		
		Attractie turboSpin = new Turbospin();
		turboSpin.setName("Turbo Spin");
		turboSpin.setPrice(2.50);
		turboSpin.setSurfaceArea(30.00);
		
		Attractie mirrorPalace = new Mirrorpalaceofhorrors();
		mirrorPalace.setName("Mirror Palace of Horrors");
		mirrorPalace.setPrice(2.75);
		mirrorPalace.setSurfaceArea(25.00);
		
		Attractie hawaii = new HawaiiCoconuts();
		hawaii.setName("Hawaii Coconuts");
		hawaii.setPrice(2.90);
		hawaii.setSurfaceArea(15.00);
		
		Attractie hauntedHouse = new Hauntedhousewithmirrors();
		hauntedHouse.setName("Haunted House - Mirror Edition");
		hauntedHouse.setPrice(3.20);
		hauntedHouse.setSurfaceArea(20.00);
		
		Attractie ladders = new Climbingladders();
		ladders.setName("Climbing Ladders");
		ladders.setPrice(5.00);
		ladders.setSurfaceArea(15.00);
		
		System.out.println("Drawers are being filled...");
		// Kassa toevoegen
		
		System.out.println("Welcome to the Crazy Carnival!");
	}
	
	void menu() {
		System.out.println("Press a number to enter an attraction.");
		System.out.println("1 | " + this.ladders.getName() + " | €" + ladders.getPrice());
		System.out.println("2 | " + hauntedHouse.getName() + " | €" + hauntedHouse.getPrice());
		System.out.println("3 | " + hawaii.getName() + " | €" + hawaii.getPrice());
		System.out.println("4 | " + mirrorPalace.getName() + " | €" + mirrorPalace.getPrice());
		System.out.println("5 | " + turboSpin.getName() + " | €" + turboSpin.getPrice());
		System.out.println("6 | " + bumperCars.getName() + " | €" + bumperCars.getPrice());
		
		String playerChoice = input.next();
		
		switch (playerChoice) {
			case "1":
				System.out.println("You chose: " + ladders.getName());
				System.out.println("That will be €" + ladders.getPrice() + " please.");
				System.out.println("3...2...1...GO!");
				ladders.play();
				break;
			case "2":
				System.out.println("You chose: " + hauntedHouse.getName());
				System.out.println("That will be €" + hauntedHouse.getPrice() + " please.");
				System.out.println("3...2...1...GO!");
				hauntedHouse.play();
				break;
			case "3":
				System.out.println("You chose: " + hawaii.getName());
				System.out.println("That will be €" + hawaii.getPrice() + " please.");
				System.out.println("3...2...1...GO!");
				hawaii.play();
				break;
			case "4":
				System.out.println("You chose: " + mirrorPalace.getName());
				System.out.println("That will be €" + mirrorPalace.getPrice() + " please.");
				System.out.println("3...2...1...GO!");
				mirrorPalace.play();
				break;
			case "5":
				System.out.println("You chose: " + turboSpin.getName());
				System.out.println("That will be €" + turboSpin.getPrice() + " please.");
				System.out.println("3...2...1...GO!");
				turboSpin.play();
				break;
			case "6":
				System.out.println("You chose: " + bumperCars.getName());
				System.out.println("That will be €" + bumperCars.getPrice() + " please.");
				System.out.println("3...2...1...GO!");
				bumperCars.play();
				break;
			default: 
				System.out.println("Wrong input! Please enter a number!");
				break;
	}
}