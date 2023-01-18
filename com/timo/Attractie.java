package Kermis.com.timo;

abstract class Attractie {
	private String name;
	private double price;
	private double surfaceArea;
	
	abstract void draaien();
	
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
	void draaien() {
		System.out.println("Engines start roaring... ");
	}
}

class Turbospin extends Attractie {
	void draaien() {
	}
}

class Mirrorpalaceofhorrors extends Attractie {
	void draaien() {
	}
}

class Hauntedhousewithmirrors extends Attractie {
	void draaien() {
	}
}

class HawaiiCoconuts extends Attractie {
	void draaien() {
	}
}

class Climbingladders extends Attractie {
	void draaien() {
	}
}