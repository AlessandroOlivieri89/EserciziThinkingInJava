package it.aleo.thinkingInJava.operators.esercizioQuattro;

public class CalcolareVelocit� {

	int km;
	
	int ore;
	
	int velocit�;
	
	public static void main(String[] args) {
		
		CalcolareVelocit� cv = new CalcolareVelocit�();
		
		cv.km = 60;
		
		cv.ore = 3;
		
		cv.velocit� = cv.km/cv.ore;

		System.out.println("Questa � la velocit� " + cv.velocit�);
	}

}
