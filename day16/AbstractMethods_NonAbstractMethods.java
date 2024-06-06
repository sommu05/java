package day16;

abstract class ABC {    // abstract class

   abstract void ab();  // abstract methods as usual don't have implementation, but have to mention abstract keyword
						// but in interface we have abstract methods, but don't need to mention abstract keyword.
                        // - default access modifier is public -- implicitly public

   void ec() {          //non abstract method - default access modifier is public -- implicitly public 
		System.out.println("Hello");
	}
	

}

//Abstract class can have abstract and non abstract method , but interface have only abstract methods.

public class AbstractMethods_NonAbstractMethods {

	public static void main(String[] args) {
		
		
		

	}

}
