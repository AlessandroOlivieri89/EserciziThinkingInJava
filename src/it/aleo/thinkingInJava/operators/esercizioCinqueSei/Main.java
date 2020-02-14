package it.aleo.thinkingInJava.operators.esercizioCinqueSei;

public class Main {

	public static void main(String[] args) {
	
		Dog cane1 = new Dog();
		
		Dog cane2 = new Dog();
		
		cane1.name = "spot";
		cane1.says = "Ruff!";
		
		cane2.name = "scruffy";
		cane2.says = "Wurf!";
		
		System.out.println("Il cane si chiama " + cane1.name + " e dice " + cane1.says);
		System.out.println("Il cane si chiama " + cane2.name + " e dice " + cane2.says);
		
		Dog cane3 = cane1;
		
		
		System.out.println(cane1 == cane3);
		System.out.println(cane1 == cane2);
		System.out.println(cane2 == cane3);
		System.out.println(cane3 == cane1);
		
	}

}
