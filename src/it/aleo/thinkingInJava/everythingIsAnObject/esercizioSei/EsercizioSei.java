package it.aleo.thinkingInJava.everythingIsAnObject.esercizioSei;

public class EsercizioSei {

	String s;
	static int storage(String s) {
		 return s.length() * 2;
		} 
	
	public static void main(String[] args) {
	
		EsercizioSei e = new EsercizioSei();
		e.s = "ciaone";
		System.out.println(storage(e.s));
		
	}

}
