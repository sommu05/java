package day15;

public class Overloading_Overriding_in_Static {
	
	static int a = 100;
	int b = 1000;
	
	static void m1(int c) {
		System.out.println("Hello Java " + c );
	}
	
	void m1(double c) {
		System.out.println("Hello Java " + c ); //overloaded the static method
	}
	
	
}

class A extends Overloading_Overriding_in_Static{
     static void m1(int c) {
	     System.out.println("Hello Java"); //overrided the static method using the method hiding concept
	     //Method hiding concept means putting the static keyword in both the Superclass and subclass methods 
	     //Without method hiding concept we cannot achieve method overriding in Static 
}



}