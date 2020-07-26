package Opdracht10;

import java.util.Scanner;

public class Oefenopdracht10 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		String invoer = scanner.nextLine();
		
		String Alfabet = "abcdefghijklmnopqrstuvwxyz";
		char Letter;
		
		for (int i = 0; i < Alfabet.length(); i++) {
			Letter = Alfabet.charAt(i);
			String string = Character.toString(Letter);
			
			if (string.equals(invoer)) {
				System.out.println("Klopt!");
				invoer = scanner.nextLine();
			} else {
				System.out.println("Fout!");
				break;
			}
		}
		
	}
}


