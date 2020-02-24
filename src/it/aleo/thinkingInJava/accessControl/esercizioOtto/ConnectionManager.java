package it.aleo.thinkingInJava.accessControl.esercizioOtto;

public class ConnectionManager {

	int maxConnections = 5;
	
	// VIOLAZIONE INCAPSULAMENTO
	// il Numero della connessione e' Tipico della Connessione e NON del ConnectionManager
	int currentConnectionId = 1;
	
	Connection [] connections = new Connection[maxConnections];
	
	public Connection getConnection() {
		
		if (currentConnectionId <= maxConnections) {
			return Connection.creaConnection(currentConnectionId);
		}
		else {
			return null;
		}
	}

}


//int x = 5;
//
//Connection[] c = new Connection[x];
//
//Connection creaConnessione() {
//
//	return Connection.creaConnection();
//
//}