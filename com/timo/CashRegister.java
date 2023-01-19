package Kermis.com.timo;

public class CashRegister {
	private double revenue;
	private int ticketsSold;
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
	
	
}
