package Kermis.com.timo;

public class CashRegister {
	private double revenue;
	private int ticketsSold;
	static private double totalRevenue;
	static private int totalTicketsSold;
		
	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		double result = this.revenue + revenue;
		setTotalRevenue(revenue);
		this.revenue = result;
	}

	public int getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(int ticketsSold) {
		int result = this.ticketsSold + ticketsSold;
		setTotalTicketsSold(ticketsSold);
		this.ticketsSold = result;
	}

	public static double getTotalRevenue() {
		return totalRevenue;
	}

	public void setTotalRevenue(double totalRevenue) {
		double result = this.totalRevenue + totalRevenue;
		this.totalRevenue = result;
	}

	public static int getTotalTicketsSold() {
		return totalTicketsSold;
	}

	public void setTotalTicketsSold(int totalTicketsSold) {
		int result = this.totalTicketsSold + totalTicketsSold;
		this.totalTicketsSold = result;
	}
	
	
}
