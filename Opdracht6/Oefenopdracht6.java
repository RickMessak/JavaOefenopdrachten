package Opdracht6;

public class Oefenopdracht6 {
	public static void main(String[] args) {
	
		
		double Lengte, Gewicht, BMI;
		Lengte = 1.75;
		Gewicht = 80.0;
		BMI = Gewicht/(Lengte*Lengte);
		
		if(BMI < 18) {
			System.out.println("geel");
		} else if (BMI >= 25) {
			System.out.println("rood");
		} else {
			System.out.println("groen");
		}
		
	
	}
}
