package Kermis.com.timo;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	static Kermis kermis = new Kermis();

	public static void main(String[] args) {
		startMenu();
	}
	
	static public void startMenu() {
		System.out.println("What would you like to do?");
		System.out.println("1 | Go to the carnival");
		System.out.println("2 | Enter backend");
		System.out.println("3 | Leave circus");
		String menuChoice = input.next();
		
		switch (menuChoice) {
		case "1":
			kermis.menu();
			break;
		case "2": 
			kermis.backEnd();
			break;
		case "3": 
			System.out.println("Thank you for your visit!");
			System.exit(0);
			break;
		default:
			System.out.println("It looks like you failed to press a number simpleton.");
			System.out.println("Try again.");
			startMenu();
			break;
		}
	}
}

class Kermis {
	public Climbingladders ladders;
	public Hauntedhousewithmirrors hauntedHouse;
	public HawaiiCoconuts hawaii;
	public Mirrorpalaceofhorrors mirrorPalace;
	public Turbospin turboSpin;
	public Ultrabumpercars bumperCars;
	
	Scanner input = new Scanner(System.in);
	
	Kermis() {
		System.out.println("Attractions are being set up...");
		Ultrabumpercars bumperCars = new Ultrabumpercars();
		constructAttraction(bumperCars, "Ultra Bumpercars", 2.50, 40.00);
		this.bumperCars = bumperCars;
		
		Turbospin turboSpin = new Turbospin();
		constructAttraction(turboSpin, "Turbo Spin", 2.50, 30.00);
		this.turboSpin = turboSpin;
		
		Mirrorpalaceofhorrors mirrorPalace = new Mirrorpalaceofhorrors();
		constructAttraction(mirrorPalace, "Mirror Palace of Horrors", 2.75, 25.00);
		this.mirrorPalace = mirrorPalace;
		
		HawaiiCoconuts hawaii = new HawaiiCoconuts();
		constructAttraction(hawaii, "Hawaii Coconuts", 2.90, 15.00);
		this.hawaii = hawaii;
		
		Hauntedhousewithmirrors hauntedHouse = new Hauntedhousewithmirrors();
		constructAttraction(hauntedHouse, "Haunted House - Mirror Edition", 3.20, 20.00);
		this.hauntedHouse = hauntedHouse;
		
		Climbingladders ladders = new Climbingladders();
		constructAttraction(ladders, "Climbing Ladders", 5.00, 15.00);
		this.ladders = ladders;
		
		System.out.println("Cash registers are being filled...");
		
		System.out.println("_______________________________");
		System.out.println(" ");
		System.out.println("Welcome to the Crazy Carnival!");
		System.out.println("_______________________________");
	}
	
	public void startAttraction(Attractie attractie) {
		System.out.println("You chose: " + attractie.getName());
		System.out.println("That will be €" + attractie.getPrice() + " please.");
		attractie.cashRegister.setRevenue(attractie.getPrice());
		attractie.cashRegister.setTicketsSold(1);
		System.out.println("3...2...1...GO!");
		attractie.play();
		menu();
	}
	
	public void constructAttraction(Attractie attractie, String name, double price, double surface) {
		attractie.setName(name);
		attractie.setPrice(price);
		attractie.setSurfaceArea(surface);
	}
	
	public void menu() {
		System.out.println("Press a number to enter an attraction.");
		System.out.println("1 | " + bumperCars.getName() + " | €" + bumperCars.getPrice());
		System.out.println("2 | " + turboSpin.getName() + " | €" + turboSpin.getPrice());
		System.out.println("3 | " + mirrorPalace.getName() + " | €" + mirrorPalace.getPrice());
		System.out.println("4 | " + hauntedHouse.getName() + " | €" + hauntedHouse.getPrice());
		System.out.println("5 | " + hawaii.getName() + " | €" + hawaii.getPrice());
		System.out.println("6 | " + ladders.getName() + " | €" + ladders.getPrice());
		System.out.println(" ");
		System.out.println("Press 'b' to go back");
		
		String playerChoice = input.next();
		
		switch (playerChoice) {
			case "1":
				startAttraction(bumperCars);
				break;
			case "2":
				startAttraction(turboSpin);
				break;
			case "3":
				startAttraction(mirrorPalace);
				break;
			case "4":
				startAttraction(hauntedHouse);
				break;
			case "5":
				startAttraction(hawaii);
				break;
			case "6":
				startAttraction(ladders);
				break;
			case "b":
				System.out.println("Going back...");
				Main.startMenu();
				break;
			default: 
				System.out.println("Wrong input! Please enter a number!");
				menu();
				break;
		}
	}
	
	public void backEnd() {
		System.out.println("What would you like to do?");
		System.out.println("o | Show revenue");
		System.out.println("k | Show ticketsales");
		System.out.println(" ");
		System.out.println("Press 'b' to go back");
		
		String menuChoice = input.next();
		
		switch (menuChoice) {
		case "o":
			System.out.println("Revenue");
			System.out.println("Nr| Attraction                     | Revenue generated            ");
			System.out.println("1 | " + bumperCars.getName() + "               | €" + bumperCars.cashRegister.getRevenue());
			System.out.println("2 | " + turboSpin.getName() + "                     | €" + turboSpin.cashRegister.getRevenue());
			System.out.println("3 | " + mirrorPalace.getName() + "       | €" + mirrorPalace.cashRegister.getRevenue());
			System.out.println("4 | " + hauntedHouse.getName() + " | €" + hauntedHouse.cashRegister.getRevenue());
			System.out.println("5 | " + hawaii.getName() + "                | €" + hawaii.cashRegister.getRevenue());
			System.out.println("6 | " + ladders.getName() + "               | €" + ladders.cashRegister.getRevenue());
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Total revenue generated            | €" + CashRegister.getTotalRevenue());
			System.out.println(" ");
			System.out.println("Press 'b' to go back");
			String input = Main.input.next();
			if (input.equals("b")) {
				backEnd();
			}
			break;
		case "k": 
			System.out.println("Ticketsales");
			System.out.println("Nr| Attraction                     | Tickets sold            ");
			System.out.println("1 | " + bumperCars.getName() + "               | " + bumperCars.cashRegister.getTicketsSold());
			System.out.println("2 | " + turboSpin.getName() + "                     | " + turboSpin.cashRegister.getTicketsSold());
			System.out.println("3 | " + mirrorPalace.getName() + "       | " + mirrorPalace.cashRegister.getTicketsSold());
			System.out.println("4 | " + hauntedHouse.getName() + " | " + hauntedHouse.cashRegister.getTicketsSold());
			System.out.println("5 | " + hawaii.getName() + "                | " + hawaii.cashRegister.getTicketsSold());
			System.out.println("6 | " + ladders.getName() + "               | " + ladders.cashRegister.getTicketsSold());
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Total number of tickets sold       | " + CashRegister.getTotalTicketsSold()); 
			System.out.println(" ");
			System.out.println("Press 'b' to go back");
			String input2 = Main.input.next();
			if (input2.equals("b")) {
				backEnd();
			}
			break;
		case "b": 
			Main.startMenu();
			break;
		default:
			System.out.println("Oh wow. This guy...");
			System.out.println("Try again.");
			backEnd();
			break;
		}
	}
}