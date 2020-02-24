package it.aleo.thinkingInJava.everythingIsAnObject.esercizioCinque;

public class DataOnly {

	/*
	 * Modificatore di accesso NON giustificato
	 */
	
	 int i;
	 double d;
	 boolean b;
	 
	public static void main(String[] args) {
		
		DataOnly data = new DataOnly(); 
		
		// accesso diretto alle variabili di istanza NON ACCETTABILE
		data.i = 10;
		data.d = 2;
		data.b = false;
		
		System.out.println(data.i);
		System.out.println(data.d);
		System.out.println(data.b);

	}

}
