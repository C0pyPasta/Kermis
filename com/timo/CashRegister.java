package Kermis.com.timo;

import java.util.ArrayList;

public class CashRegister {
	private double revenue;
	private int ticketsSold;
	private TaxCollector taxCollector = new TaxCollector();
	private boolean taxCollected;

	private static double totalRevenue;
	private static int totalTicketsSold;
		
	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue += revenue;
		setTotalRevenue(revenue);
	}

	public int getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(int ticketsSold) {
		this.ticketsSold += ticketsSold;
		setTotalTicketsSold(ticketsSold);
	}

	public static double getTotalRevenue() {
		return totalRevenue;
	}

	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue += totalRevenue;
	}

	public static int getTotalTicketsSold() {
		return totalTicketsSold;
	}

	public void setTotalTicketsSold(int totalTicketsSold) {
		this.totalTicketsSold += totalTicketsSold;
	}
	
	public boolean isTaxCollected() {
		return taxCollected;
	}

	public void setTaxCollected(boolean taxCollected) {
		this.taxCollected = taxCollected;
	}
	
	public void giveLedger(ArrayList<Attractie> arrayList) {
		System.out.println("Financial worker: *Cowers in fear* and hands over ledger. ");
		taxCollector.collectTax(arrayList);
		setTaxCollected(true);
	}
	
}
