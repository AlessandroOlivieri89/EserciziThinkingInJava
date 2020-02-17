package it.aleo.thinkingInJava.initializationCleanup.esercizioDue;

public class ProvaStringa {

	private String string = "Io sono giorgia";
	
	public ProvaStringa () {
		
	}
	
	public ProvaStringa (String string) {
		
	}


	public String getString() {
		return string;
	}


	public void setString(String string) {
		this.string = string;
	}
	
	public String stampaStringa() {
		System.out.println(string);
		return string;
	}
	
}
