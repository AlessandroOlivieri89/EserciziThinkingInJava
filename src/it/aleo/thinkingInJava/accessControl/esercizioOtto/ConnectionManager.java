package it.aleo.thinkingInJava.accessControl.esercizioOtto;

public class ConnectionManager {

	int x = 5;
	
	Connection [] c = new Connection[x];
	
	void creaOggetto() {
		for (int i = 1; i<=x; i++) {
			Connection.creaConnection();
			System.out.println("Nuovo oggetto in array " + c.getClass().getSimpleName());
		}
		c = null;
		System.out.println("Nuovo oggetto fuori array " + c);
	}
	
	
}




//x++;