package it.aleo.thinkingInJava.initializationCleanup.esercizioDiciassette;

public class Main {

	private Persona[] p;
	
public static void main(String[] args) {
		
		
		int x = 4;
		
		Persona[] p = new Persona [x];
		
		Persona persona = new Persona("ciao");		
		
		Persona persona2 = new Persona("io");	
		
		Persona persona3 = new Persona("sono");	
		
		Persona persona4 = new Persona ("alessandro");
		
		p[0] = persona;
		
		p[1] = persona2;
		
		p[2] = persona3;
		
		p[3] = persona4;
		
	}
}
