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

class Turbospin extends Attractie {
	void play() {
		System.out.println(this.getName() + " is spinning");
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

class HawaiiCoconuts extends Attractie {
	void play() {
		System.out.println(this.getName() + " is spinning");
	}
}

class Climbingladders extends Attractie {
	void play() {
		System.out.println(this.getName() + " is spinning");
	}
}