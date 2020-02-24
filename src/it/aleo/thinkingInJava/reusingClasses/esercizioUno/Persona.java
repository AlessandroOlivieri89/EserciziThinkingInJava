package it.aleo.thinkingInJava.reusingClasses.esercizioUno;

public class Persona {

	private String nome;
	
	private String cognome;

	
	public Persona() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	// INGIUSTIFICATO il modificatore di DEFAULT
	Animale a = new Animale();
	
}
