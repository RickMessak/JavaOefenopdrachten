package Opdracht3;

import java.util.Scanner;

public class Oefenopdracht3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int invoer = scanner.nextInt();
			
		if(invoer > 6) {
			System.out.println("hoger");
		} else if (invoer < 6) {
			System.out.println("lager");
		} else {
			System.out.println("gelijk");
		}
		
		System.out.println("einde programma");
		}
	}

