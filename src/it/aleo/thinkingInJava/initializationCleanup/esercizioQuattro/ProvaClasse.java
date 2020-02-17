package it.aleo.thinkingInJava.initializationCleanup.esercizioQuattro;

public class ProvaClasse {

	private String string;
	
	public ProvaClasse(String string) {
		System.out.println(string);
	}

	public ProvaClasse() {
	
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	
}
