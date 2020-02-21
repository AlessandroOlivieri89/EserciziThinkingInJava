package it.aleo.thinkingInJava.accessControl.esercizioOtto;

public class ConnectionManager {

	int x = 5;
	
	Connection [] c = new Connection[x];
	
	void testStatic() {
		Connection c1 = Connection.creaConnection();
	}
	
	
}
