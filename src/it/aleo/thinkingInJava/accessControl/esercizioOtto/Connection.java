package it.aleo.thinkingInJava.accessControl.esercizioOtto;

class Connection {

	private Connection() {

	}

	public static Connection creaConnection() {
		return new Connection();
	}

}














//if (x >= 0 && x <= 5) {
//Connection ogg = new Connection();
//System.out.println(x + ") Nuovo oggetto" + ogg);
//return ogg;
//}
//else {
//Connection ogg = null;
//System.out.println(x + ") Nuovo oggetto null" + ogg);
//return ogg;
//}