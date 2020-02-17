package it.aleo.thinkingInJava.controllingExecution.esercizioDue;

import java.util.Random;

public class EsercizioDue {

	static int conteggioValoriX;
	static int conteggioValoriY;

	public static void main(String[] args) {

		Random random1 = new Random();

		Random random2 = new Random();

		for (int i = 0; i < 25; i++) {

			int x = random1.nextInt();
			int y = random2.nextInt();

			if (x >= y) {
				conteggioValoriX++;
			} else
				conteggioValoriY++;

			System.out.println("Questo è il conteggio di quante volte x è superiore " + conteggioValoriX);
			System.out.println("Questo è il conteggio di quante volte y è superiore " + conteggioValoriY);
		}

	}

}
