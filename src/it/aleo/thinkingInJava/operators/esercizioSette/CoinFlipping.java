package it.aleo.thinkingInJava.operators.esercizioSette;

import java.util.Random;

public class CoinFlipping {
	
	static Random random = new Random();
	static boolean lancio = random.nextBoolean();
	
	
	public static void main(String[] args) {
		
		Moneta moneta = new Moneta();
		
		if (lancio == true) {
			moneta.controlloLancio = "Testa";
		}
		else moneta.controlloLancio = "Croce";
		
		System.out.println(moneta.controlloLancio);
	
	}

}
