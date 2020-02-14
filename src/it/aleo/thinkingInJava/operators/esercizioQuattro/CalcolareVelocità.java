package it.aleo.thinkingInJava.operators.esercizioQuattro;

public class CalcolareVelocità {

	int km;
	
	int ore;
	
	int velocità;
	
	public static void main(String[] args) {
		
		CalcolareVelocità cv = new CalcolareVelocità();
		
		cv.km = 60;
		
		cv.ore = 3;
		
		cv.velocità = cv.km/cv.ore;

		System.out.println("Questa è la velocità " + cv.velocità);
	}

}
