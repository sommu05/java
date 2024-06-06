package day19;

//Type casting for parent and child relationship

class Parent {

	int a = 10;
	void m1() {
		System.out.println("Hello");
	}
}

class Child extends Parent {

	int b = 120;
	void m2() {
		System.out.println("Hi");
	}
}

public class TypeCastingObjects1 {
	public static void main(String[] args) {

		// Normally we create child class object to access everything

		Child obj = new Child();
		System.out.println(obj.a);
		obj.m1();
		System.out.println(obj.b);
		obj.m2();   
		
		
		
		//Upcasting   - can access only the Parent stuffs 
		
		Parent p = new Child();    //we are storing the lowest object(Child) into the higher object/ reference variable(p) 
		p.m1();
		System.out.println(p.a);
		//p.m2();  //cannot access
		//System.out.println(p.b); //cannot access
		
		
		// Converting the child object the 
		//even though the object is created for the child, we cannot access everything from the child class
		//As the reference variable is a parent that is the reason we can access the variables and methods only in the parent class.
		
		
		
		
		

		//------------------------//------------------------//------------------------//------------------------
		//Don't prefer downcasting
		
		//Downcasting - can access Parent stuffs and child stuffs
		
	/*	Parent p = new Parent();      //Creating a object for parent first 
		
		Child c = (Child) p;   // we are storing the higher object(p) into the lowest variable(p) 
		System.out.println(c);
		System.out.println(c.a);
		c.m1();
		System.out.println(c.b);
		c.m2();   */
		
		
		//we have to specify Child class 
		//we are trying to store higher into lower which is called downcasting 
		//so when you do downcasting explicitly we have to specify the child class we are reducing the size parent to child
		//when you do downcasting what we can do is we cannot access certain variables from the child  class so that's the reason downcasting is not preferred most of the times
		//If we execute we will get the error java.lang.ClassCastException: Parent cannot be cast to class
	}

}
