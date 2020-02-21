package it.aleo.thinkingInJava.accessControl.esercizioOtto;

public class Main {

	public static void main(String[] args) {
	
		ConnectionManager cm = new ConnectionManager();
		
//		for (int c = 0; c < cm.x; c++) {
		
//			System.out.println("oggetti " + cm.c1.getClass().getSimpleName());		
//		}
		
		System.out.println(cm.c[cm.x] = Connection.creaConnection());
		
//		cm.c1.creaConnection();
	}

}
