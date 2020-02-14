package it.aleo.thinkingInJava.operators.esercizioTre;

public class Method {
	static void metodo (AliasingMethod am) {
		am.f= 'e';
	}
	
	public static void main(String[] args) {
		
		
		
		AliasingMethod alme = new AliasingMethod();
		
		alme.f = 'o';
		System.out.println("1: alme.f " + alme.f);
		metodo(alme);
		System.out.println("2: alme.f " + alme.f);

	}
}
