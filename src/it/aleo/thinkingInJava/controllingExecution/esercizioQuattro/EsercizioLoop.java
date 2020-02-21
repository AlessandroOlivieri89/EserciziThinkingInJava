package it.aleo.thinkingInJava.controllingExecution.esercizioQuattro;

public class EsercizioLoop {

	public static void main(String[] args) {

		boolean isPrime= true;
		
		for (int x = 2; x < 100; x++) {
			for (int y = 2; y < x; y++) {
				if (x % y == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				System.out.println(x + "è un numero primo");
				
			}
			else isPrime = true;
		}

	}

}
