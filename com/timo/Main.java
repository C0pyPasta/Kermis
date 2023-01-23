package Kermis.com.timo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		startMenu();
	}
	
	static public void startMenu() {
		Kermis kermis = new Kermis();
		System.out.println("What would you like to do?");
		System.out.println("1 | Go to the carnival");
		System.out.println("2 | Staff only");
		System.out.println("3 | Leave carnival");
		String menuChoice = input.next();
		
		switch (menuChoice.toLowerCase()) {
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
	public Attractie ladders = new Climbingladders();
	public Attractie hauntedHouse = new Hauntedhousewithmirrors();
	public Attractie hawaii = new HawaiiCoconuts();
	public Attractie mirrorPalace = new Mirrorpalaceofhorrors();
	public Attractie turboSpin = new Turbospin();
	public Attractie bumperCars  = new Ultrabumpercars();
	ArrayList<Attractie> AttractionsArray = new ArrayList<>();
	public CashRegister cashRegister = new CashRegister();
	
	Scanner input = new Scanner(System.in);
	
	Kermis() {
		System.out.println("Attractions are being set up...");
		constructAttraction(bumperCars, "Ultra Bumpercars", 2.50, 40.00);
		constructAttraction(turboSpin, "Turbo Spin", 2.50, 30.00);
		constructAttraction(mirrorPalace, "Mirror Palace of Horrors", 2.75, 25.00);
		constructAttraction(hawaii, "Hawaii Coconuts", 2.90, 15.00);
		constructAttraction(hauntedHouse, "Haunted House - Mirror Edition", 3.20, 20.00);;
		constructAttraction(ladders, "Climbing Ladders", 5.00, 15.00);
		
		System.out.println("Cash registers are being filled...");
		
		System.out.println("_______________________________");
		System.out.println(" ");
		System.out.println("Welcome to the Crazy Carnival!");
		System.out.println("_______________________________");
		System.out.println(" ");
	}
	
	public void startAttraction(Attractie attractie) {
		System.out.println("You chose: " + attractie.getName());
		System.out.println("That will be €" + attractie.getPrice() + " please.");
		attractie.cashRegister.setRevenue(attractie.getPrice());
		attractie.cashRegister.setTicketsSold(1);
		System.out.println(" ");
		System.out.println("3...2...1...GO!");
		System.out.println(" ");
		attractie.play();
		System.out.println(" ");
		menu();
	}
	
	public void constructAttraction(Attractie attractie, String name, double price, double surface) {
		attractie.setName(name);
		attractie.setPrice(price);
		attractie.setSurfaceArea(surface);
		AttractionsArray.add(attractie);
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
		
		switch (playerChoice.toLowerCase()) {
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
				System.out.println(" ");
				Main.startMenu();
				break;
			default: 
				System.out.println("Wrong input! You thought bashing keys would get you anywhere?");
				menu();
				break;
		}
	}
	
	public void backEnd() {
		System.out.println("What would you like to do?");
		System.out.println("o | Show revenue");
		System.out.println("k | Show ticketsales");
		System.out.println("t | tax collector");
		System.out.println(" ");
		System.out.println("Press 'b' to go back");
		
		String menuChoice = input.next();
		
		switch (menuChoice.toLowerCase()) {
		case "o":
			showRevenue();
			break;
		case "k": 
			showTicketSales();
			break;
		case "t": 
			sendInTheShark(AttractionsArray);
			break;
		case "b": 
			System.out.println(" ");
			Main.startMenu();
			break;
		default:
			System.out.println("Oh wow. This guy...");
			System.out.println("Try again.");
			System.out.println(" ");
			backEnd();
			break;
		}
	}
	
	public void showRevenue() {
		System.out.println("Revenue");
		System.out.println("Nr| Attraction                     | Revenue generated            ");
		System.out.println("1 | " + bumperCars.getName() + "               | €" + bumperCars.cashRegister.getRevenue());
		System.out.println("2 | " + turboSpin.getName() + "                     | €" + turboSpin.cashRegister.getRevenue());
		System.out.println("3 | " + mirrorPalace.getName() + "       | €" + mirrorPalace.cashRegister.getRevenue());
		System.out.println("4 | " + hauntedHouse.getName() + " | €" + hauntedHouse.cashRegister.getRevenue());
		System.out.println("5 | " + hawaii.getName() + "                | €" + hawaii.cashRegister.getRevenue());
		System.out.println("6 | " + ladders.getName() + "               | €" + ladders.cashRegister.getRevenue());
		System.out.println("----------------------------------------------------");
		System.out.println("Total revenue generated            | €" + cashRegister.getTotalRevenue());
		System.out.println(" ");
		System.out.println("Press 'k' for ticketsales");
		System.out.println("Press 'b' to go back");
		String input = Main.input.next();
		switch (input.toLowerCase()) {
		case "o":
			showRevenue();
			break;
		case "k": 
			showTicketSales();
			break;
		case "b": 
			System.out.println(" ");
			Main.startMenu();
			break;
		default: 
			System.out.println("Wrong!");
			System.out.println(" ");
			showTicketSales();
		}
	}
	public void showTicketSales() {
		System.out.println("Ticketsales");
		System.out.println("Nr| Attraction                     | Tickets sold            ");
		System.out.println("1 | " + bumperCars.getName() + "               | " + bumperCars.cashRegister.getTicketsSold());
		System.out.println("2 | " + turboSpin.getName() + "                     | " + turboSpin.cashRegister.getTicketsSold());
		System.out.println("3 | " + mirrorPalace.getName() + "       | " + mirrorPalace.cashRegister.getTicketsSold());
		System.out.println("4 | " + hauntedHouse.getName() + " | " + hauntedHouse.cashRegister.getTicketsSold());
		System.out.println("5 | " + hawaii.getName() + "                | " + hawaii.cashRegister.getTicketsSold());
		System.out.println("6 | " + ladders.getName() + "               | " + ladders.cashRegister.getTicketsSold());
		System.out.println("----------------------------------------------------");
		System.out.println("Total number of tickets sold       | " + cashRegister.getTotalTicketsSold()); 
		System.out.println(" ");
		System.out.println("Press 'o' for revenue");
		System.out.println("Press 'b' to go back");
		String input2 = Main.input.next();
		switch (input2.toLowerCase()) {
		case "o":
			showRevenue();
			break;
		case "k": 
			showTicketSales();
			break;
		case "b": 
			System.out.println(" ");
			Main.startMenu();
			break;
		default: 
			System.out.println("Wrong!");
			System.out.println(" ");
			showTicketSales();
		}
	}

	public void sendInTheShark(ArrayList<Attractie> arrayList) {
		System.out.println("Taxcollector Johnson 'The Shark of Carnivalstreet' reporting for duty. Convey thy ledger puny financial worker!");
		cashRegister.giveLedger(arrayList);
	}
}