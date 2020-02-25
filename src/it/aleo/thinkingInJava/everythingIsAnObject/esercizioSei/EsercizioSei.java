package it.aleo.thinkingInJava.everythingIsAnObject.esercizioSei;

public class EsercizioSei {

	// Modificatore di accesso NON giustificato
	String s;

	// Modificatore di accesso NON giustificato
	static int storage(String s) {
		 return s.length() * 2;
		} 
	
	public static void main(String[] args) {
	
		EsercizioSei e = new EsercizioSei();
		
		// Accesso diretto alle variabili non ammesso
		e.s = "ciaone";
		System.out.println(storage(e.s));
		
	}

}
