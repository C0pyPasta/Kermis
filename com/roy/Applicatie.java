package Kermis.com.roy;

import java.util.Scanner;

public class Applicatie 
{
	private static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Menu();
		
		int num = scanner.nextInt();
		Keuze(num);
	}
	
	private static void Menu()
	{
		System.out.println("Maak een keuze:");
		System.out.println("");
		System.out.println("1: Botsauto's");
		System.out.println("2: Spin");
		System.out.println("3: Spiegelpaleis");
		System.out.println("4: Spookhuis");
		System.out.println("5: Hawaii");
		System.out.println("6: Ladderklimmen");
	}
	
	private static void Keuze(int num)
	{
		switch(num)
		{
		case 1:
			// code
			break;
			
		}
	}
}
