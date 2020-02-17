package it.aleo.thinkingInJava.initializationCleanup.esercizioSei;

public class Dog {

	private int i = 10;
	
	private long l = 200;
	
	private short s = 5;
	
	private char c = 3;
	
	private double d = 8;
	
	
	public void bark(int i, long l) {
		System.out.println(i + l);
	}
	
	public void bark(long l, int i) {
		System.out.println(l + i);
	}

	public void bark(short s) {
		System.out.println(s);
	}
	
	public void bark(char c) {
		System.out.println(c);
	}
	
	public void bark(double d) {
		System.out.println(d);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public long getL() {
		return l;
	}

	public void setL(long l) {
		this.l = l;
	}

	public short getS() {
		return s;
	}

	public void setS(short s) {
		this.s = s;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}
	
	
}
