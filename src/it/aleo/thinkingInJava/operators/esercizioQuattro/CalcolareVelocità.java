package it.aleo.thinkingInJava.operators.esercizioQuattro;

public class CalcolareVelocitā {

	int km;
	
	int ore;
	
	int velocitā;
	
	public static void main(String[] args) {
		
		CalcolareVelocitā cv = new CalcolareVelocitā();
		
		cv.km = 60;
		
		cv.ore = 3;
		
		cv.velocitā = cv.km/cv.ore;

		System.out.println("Questa č la velocitā " + cv.velocitā);
	}

}
