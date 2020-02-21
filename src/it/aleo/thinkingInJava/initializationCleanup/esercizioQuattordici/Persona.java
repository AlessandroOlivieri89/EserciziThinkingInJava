package it.aleo.thinkingInJava.initializationCleanup.esercizioQuattordici;

public class Persona {

	public static String nome = "Alessandro";
	
	static Persona p;
	
	static {
		p = new Persona("Alessandro");
	}
	
	public Persona(String string) {
		nome = "Alessandro";
	}

	public void stampa() {
		System.out.println("Stringa 1 " + nome);
		
	}
}
