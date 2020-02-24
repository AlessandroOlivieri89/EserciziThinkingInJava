package it.aleo.thinkingInJava.accessControl.esercizioOtto;

public class Main {

	public static void main(String[] args) {

		ConnectionManager connectionManager = new ConnectionManager();
		
		for (int i = 0; i<10; i++) {
			Connection connection = connectionManager.getConnection();
			if(connection!=null) {
				System.out.println("Nuova connessione con id " + connectionManager.currentConnectionId);
				
				// VIOLATO INFORMATION HIDING
				connectionManager.currentConnectionId++;
			}
			else {
				System.out.println("Connessioni finite!");
			}
		}
	}
}

//ConnectionManager cm = new ConnectionManager();
//
//for (int id = 1; id<=cm.x; id++) {
//	cm.creaConnessione();
//	System.out.println("Nuovo connessione in array " + cm.getClass().getSimpleName());
//}
//	
