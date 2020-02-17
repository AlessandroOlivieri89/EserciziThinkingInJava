package it.aleo.thinkingInJava.initializationCleanup.esercizioSei;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		
	
		dog.bark(dog.getI(), dog.getL());
		
		dog.bark(dog.getL(), dog.getI());
		
		dog.bark(dog.getS());
		
		dog.bark(dog.getC());
		
		dog.bark(dog.getD());
	}

}
