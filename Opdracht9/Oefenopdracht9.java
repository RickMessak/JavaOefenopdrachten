package Opdracht9;

public class Oefenopdracht9 {
	public static void main(String[] args) {
		
		int Getal = 9;
		int Faculteit = 1;
		
		for (int i=1; i <= Getal; i++) {
			Faculteit = Faculteit*i;
		}
		
		System.out.println("Faculteit van "+ Getal + " = " + Faculteit);	
	}
}
