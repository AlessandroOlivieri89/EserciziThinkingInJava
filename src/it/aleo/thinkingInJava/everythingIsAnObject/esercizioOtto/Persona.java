package it.aleo.thinkingInJava.everythingIsAnObject.esercizioOtto;

public class Persona {

	
	
	// Modificatore di Accesso DEFAULT NON Giustificato/inaccettabile/gia' spiegato piu' volte con esercizi specifici
	static int numeroGambe = 2;
	
	String coloreCapelli;
	
	int et�;
	
	String nazionalit�;
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		
		
		
		// Accesso diretto alle variabili di istanza NON ammissibile
		p1.coloreCapelli = "Neri";
		p1.et� = 30;
		p1.nazionalit� = "Svedese";
		
		System.out.println("Questo � il colore dei capelli: " + p1.coloreCapelli);
		System.out.println("Questa � l'et�: " + p1.et�);
		System.out.println("Questa � la nazionalit�: " + p1.nazionalit�);
		System.out.println("Questo � il numero di gambe: " + numeroGambe);
		
		p2.coloreCapelli = "Rossi";
		p2.et� = 27;
		p2.nazionalit� = "Russa";
		
		System.out.println("Questo � il colore dei capelli: " + p2.coloreCapelli);
		System.out.println("Questa � l'et�: " + p2.et�);
		System.out.println("Questa � la nazionalit�: " + p2.nazionalit�);
		System.out.println("Questo � il numero di gambe: " + numeroGambe);
		
		p3.coloreCapelli = "Biondi";
		p3.et� = 22;
		p3.nazionalit� = "Finlandese";
		
		System.out.println("Questo � il colore dei capelli: " + p3.coloreCapelli);
		System.out.println("Questa � l'et�: " + p3.et�);
		System.out.println("Questa � la nazionalit�: " + p3.nazionalit�);
		System.out.println("Questo � il numero di gambe: " + numeroGambe);
	}

}
