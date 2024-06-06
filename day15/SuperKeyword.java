package day15;

class Animal {

	String color = "White";

	void m1() {
		System.out.println("Java Selenium");
	}
}



class Dog extends Animal {

	String color = "Black";
	
	void displaycolor() {
//		System.out.println(color);
		System.out.println(super.color);
	}
	
	void m1() {
//		System.out.println("Python Selenium");
		super.m1();
	}

}



public class SuperKeyword {

}
