package Opdracht8;

public class Oefenopdracht8 {
	public static void main(String[] args) {
	
		String Woord = "Bruine Bloemen!";
		int woordLengte = Woord.length();
		
		for(int i = 0; i < woordLengte; i++) {
			char letter = Woord.charAt(i);
			if(Woord.substring (i, i+1).equals("a") || Woord.substring (i, i+1).equals("e") || Woord.substring (i, i+1).equals("i")
					|| Woord.substring (i, i+1).equals("o") || Woord.substring (i, i+1).equals("u") || Woord.substring (i, i+1).equals("y")) {
				System.out.println(Woord.substring(i, i+1)+"*");
			} else {
				System.out.println(Woord.substring(i, i+1));
			}	
	}
  }
}
