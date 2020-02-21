package it.aleo.thinkingInJava.initializationCleanup.esercizioSedici;

public class EsercizioSedici {
	
	static String[] s = { "ciao ", "io ", "sono ", "alessandro"};
	
	public static void main(String[] args) {
		System.out.println(s.toString());
		System.out.println(s);
		System.out.println("stampa array");
		for (int x = 0; x < s.length; x++) {
			 System.out.print(s[x]);
		}

	}

}
