package it.aleo.thinkingInJava.operators.esercizioSette;

import java.util.Random;

public class CoinFlipping {
	
	static Random random = new Random();
	static boolean esitoLancio = random.nextBoolean();
	
	
	public static void main(String[] args) {
		
		Moneta moneta = new Moneta();
		
		if (esitoLancio) {
			moneta.setFacciaInSu("Testa");
		}
		else moneta.setFacciaInSu("Croce");
		
		System.out.println(moneta.getFacciaInSu());
	
	}

}
