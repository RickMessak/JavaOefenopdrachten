package Opdracht4;

public class Oefenopdracht4 {

	public static void main(String[] args) {
	
		String Woord = "deze zin bevat veel eeeeeee's";
		
		int Tellen = 0;
		char deLetterE = 'e';
		
		
		for(int i = 0; i < Woord.length(); i++) {
			if(Woord.charAt(i) == deLetterE) {
				Tellen++;
			}
		}

		System.out.println("Deze zin bevat "+Tellen+ " keer de letter 'e'");
		
	}

}

