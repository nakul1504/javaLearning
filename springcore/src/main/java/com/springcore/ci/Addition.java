package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		//super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor of type int, int");
	}
	
	public Addition(double a, double b) {
		//super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor of type double, double");
	}
	
	public Addition( String a, String b) {
		//super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor of type String, String");
	}
	
	public void doSum() {
		//super();
		System.out.println("valur of a:" + this.a);
		System.out.println("valur of b:" + this.b);
		System.out.println("sum is: " + (this.a + this.b) );
	}
	
	

}
