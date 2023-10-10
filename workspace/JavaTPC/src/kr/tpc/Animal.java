package kr.tpc;

public class Animal extends Object{
	// Dog, Cat --> eat()
	public void eat() {
		  System.out.println("?"); // 포괄적, 추상적
	}
	
	public Animal() {
		super(); // 여기서는 new Object()
	}
	
}