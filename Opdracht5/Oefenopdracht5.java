package Opdracht5;

import java.util.Scanner;

public class Oefenopdracht5 {
	public static void main(String[] args) {
		
		String Wachtwoord = "java";
		
		Scanner Scanner2 = new Scanner(System.in);
		String Invoer = Scanner2.nextLine();
		
		
		if(Wachtwoord.equals(Invoer)) {
			System.out.println("Het wachtwoord is correct")
			;
			
		} else {
			System.out.println("Het wachtwoord is incorrect. Probeer opnieuw");
			
		}
		
	}
}

