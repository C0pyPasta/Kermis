package Kermis.com.timo;

abstract class Attractie {
	private String name;
	private double price;
	private double surfaceArea;

	public CashRegister cashRegister = new CashRegister();
		
	abstract void play();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}
	
	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
}

class Ultrabumpercars extends Attractie {
	void play() {
		System.out.println(this.getName() + " is spinning");
	}
}

class Turbospin extends RiskAttraction {
	public int limit = 0;
	void play() {
		if (limit < 4) {
			System.out.println(this.getName() + " is spinning");
			limit++;
		} else {
			System.out.println("As " + this.getName() + " was spinning, nuts and bolts started flying around.");
			setUpInspection();
			limit = 0;
		}
	}
	
	void setUpInspection() {
		System.out.println("MAINTENANCE AND INSPECTION!");
		System.out.println("Inspector wallace grabs his checklist...");
		System.out.println("The carnival manager starts sweating profusifly. Will the attraction make it through inspection?");
		System.out.println("APPROVED! (Although extra insurance might be a good idea).");
	}
}

class Mirrorpalaceofhorrors extends Attractie {
	void play() {
		System.out.println(this.getName() + " is spinning");
	}
}

class Hauntedhousewithmirrors extends Attractie {
	void play() {
		System.out.println(this.getName() + " is spinning");
	}
}

class HawaiiCoconuts extends RiskAttraction {
	public int limit = 0;
	void play() {
		if (limit < 9) {
			System.out.println(this.getName() + " is spinning");
			limit++;
		} else {
			System.out.println("As " + this.getName() + " was spinning, nuts and bolts started flying around.");
			setUpInspection();
			limit = 0;
		}
	}
	
	void setUpInspection() {
		System.out.println("MAINTENANCE AND INSPECTION!");
		System.out.println("Inspector wallace grabs his checklist...");
		System.out.println("The carnival manager starts sweating profusifly. Will the attraction make it through inspection?");
		System.out.println("APPROVED! (Although extra insurance might be a good idea).");
	}
}

class Climbingladders extends Attractie implements GamblingAttraction {
	void play() {
		System.out.println(this.getName() + " is spinning");
	}
	
	public void payGamblingTax() {
		// 30% van de omzet gaat naar meneer de staat :(
	}
}