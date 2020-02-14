package it.aleo.thinkingInJava.everythingIsAnObject.esercizioSette;

public class Incrementable {

	
	static void increment() {
		StaticTest.i--;
	}
	public static void main(String[] args) {
		
		Incrementable.increment();
		System.out.println(StaticTest.i);
	}

}
