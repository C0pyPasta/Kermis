package Kermis.com.timo;

abstract class RiskAttraction extends Attractie {
	void play() {
		System.out.println("This is a risk attraction");
	}
	abstract void setUpInspection();
}
