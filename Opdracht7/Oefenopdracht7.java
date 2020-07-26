package Opdracht7;

import java.util.Scanner;

public class Oefenopdracht7 {

	public static void main(String[] args) {
		
		Scanner _scanner = new Scanner(System.in);
		System.out.println("Vul een zinnetje in");
		
		String Woord = _scanner.nextLine();
		String WoordOmgekeerd = "";
		
		
		char[] charArr = Woord.toCharArray();
		for (int i = charArr.length -1; i >= 0; i--) {
			WoordOmgekeerd += charArr[i];
		}
		
		System.out.println("Het zinnetje is omgedraaid!");
		System.out.println(WoordOmgekeerd);
		
	}

}
