package it.aleo.thinkingInJava.controllingExecution.esercizioUno;

public class EsercizioUno {

	//ERRORE di SCOPE
	// Variabile inutilizzata
	int i;

	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}
	}

}
