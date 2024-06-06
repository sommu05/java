package day13;

public class Statickeyword {

	static int a= 10;          //static variable
	int b= 20;                 // non static variable
	
	static void m1() {         //static method
		System.out.println("Hello Java");
	}
	
	void m2() {                //non static method
		System.out.println("Hello Java");
		
	}
	
    void m () {              //non static method here I'm accessing all the static and non static stuffs
    	System.out.println(a);
    	System.out.println(b);
    	m1();
    	m2();
    } 
	
}
