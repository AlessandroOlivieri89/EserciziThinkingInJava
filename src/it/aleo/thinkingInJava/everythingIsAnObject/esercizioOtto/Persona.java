package it.aleo.thinkingInJava.everythingIsAnObject.esercizioOtto;

public class Persona {

	
	
	// Modificatore di Accesso DEFAULT NON Giustificato/inaccettabile/gia' spiegato piu' volte con esercizi specifici
	static int numeroGambe = 2;
	
	String coloreCapelli;
	
	int età;
	
	String nazionalità;
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		
		
		
		// Accesso diretto alle variabili di istanza NON ammissibile
		p1.coloreCapelli = "Neri";
		p1.età = 30;
		p1.nazionalità = "Svedese";
		
		System.out.println("Questo è il colore dei capelli: " + p1.coloreCapelli);
		System.out.println("Questa è l'età: " + p1.età);
		System.out.println("Questa è la nazionalità: " + p1.nazionalità);
		System.out.println("Questo è il numero di gambe: " + numeroGambe);
		
		p2.coloreCapelli = "Rossi";
		p2.età = 27;
		p2.nazionalità = "Russa";
		
		System.out.println("Questo è il colore dei capelli: " + p2.coloreCapelli);
		System.out.println("Questa è l'età: " + p2.età);
		System.out.println("Questa è la nazionalità: " + p2.nazionalità);
		System.out.println("Questo è il numero di gambe: " + numeroGambe);
		
		p3.coloreCapelli = "Biondi";
		p3.età = 22;
		p3.nazionalità = "Finlandese";
		
		System.out.println("Questo è il colore dei capelli: " + p3.coloreCapelli);
		System.out.println("Questa è l'età: " + p3.età);
		System.out.println("Questa è la nazionalità: " + p3.nazionalità);
		System.out.println("Questo è il numero di gambe: " + numeroGambe);
	}

}
