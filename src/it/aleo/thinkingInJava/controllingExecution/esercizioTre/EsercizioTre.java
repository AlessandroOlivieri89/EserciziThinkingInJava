package it.aleo.thinkingInJava.controllingExecution.esercizioTre;

import java.util.Random;

public class EsercizioTre {
	
	
	
	// NON Giustificato il modificatore di Default
	static int conteggioValoriX;
	static int conteggioValoriY;
	
	public static void main(String[] args) {
		
	
		
		Random random1 = new Random();
	
		Random random2 = new Random();
		
		for (int i = 0; i<25; i++) {
			while (i>0) {
				int x = random1.nextInt();
				int y = random2.nextInt();
				if (x>=y) {
					conteggioValoriX++;
				}
				else conteggioValoriY++;
				
				System.out.println("Questo � il conteggio di quante volte x � superiore " + conteggioValoriX);
				System.out.println("Questo � il conteggio di quante volte y � superiore " + conteggioValoriY);
			}
			
			
		}
		
		
		

	}

}
