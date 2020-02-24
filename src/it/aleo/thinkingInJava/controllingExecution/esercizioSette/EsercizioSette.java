package it.aleo.thinkingInJava.controllingExecution.esercizioSette;


public class EsercizioSette {

	// ERRORE DI SCOPE
	// Variabile NON UTILIZZATA se la commento NON CAMBIA NULLA
	// int i;

	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {
//			if (i == 100) break;
			if (i == 100) return;
			System.out.println(i);
		}
	}

}
