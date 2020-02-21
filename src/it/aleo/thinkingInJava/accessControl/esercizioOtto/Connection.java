package it.aleo.thinkingInJava.accessControl.esercizioOtto;

class Connection {

	private Connection() {
		
	}
	
	public static Connection creaConnection() {
		return new Connection();
	}
	
//	public static Connection creaConnection() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("creaConnection(): " + i);
//		return new Connection();
//		} return null;
//	}
}
