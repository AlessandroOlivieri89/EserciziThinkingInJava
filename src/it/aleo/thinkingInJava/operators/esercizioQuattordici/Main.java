package it.aleo.thinkingInJava.operators.esercizioQuattordici;

public class Main {

	String arg1;
	String arg2;
	
	public void comparaParametri(String arg1, String arg2) {
		System.out.println(arg1 == arg2);
		System.out.println(arg1 != arg2);
	}
	public static void main(String[] args) {
		
		Main main1 = new Main();
		main1.arg1 = "Io";
		main1.arg2 = "Io";
		
		main1.comparaParametri(main1.arg1, main1.arg2);
		
		Main main2 = new Main();
		main2.arg1 = "Io";
		main2.arg2 = "Sono";
		
		main2.comparaParametri(main2.arg1, main2.arg2);
	}

}
