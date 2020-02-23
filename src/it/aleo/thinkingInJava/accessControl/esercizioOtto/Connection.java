package it.aleo.thinkingInJava.accessControl.esercizioOtto;

class Connection {

	public int connectionId;
	
	private Connection() {
		
	}

	private Connection(int id) {
		this.connectionId = id;
	}
	
	public static Connection creaConnection(int id) {
		return new Connection(id);
	}

}




//private int id;
//
//private Connection() {
//
//}
//
//public static Connection creaConnection() {
//	return new Connection();
//}
//
//public int getId() {
//	return id;
//}
//
//public void setId(int id) {
//	this.id = id;
//}