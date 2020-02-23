package it.aleo.thinkingInJava.accessControl.esercizioOtto;

public class ConnectionManager {

	int maxConnections = 5;
	
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