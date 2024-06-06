package day16;

interface Test{
	
	int a = 10;         //static and final variables
	String b = "Hello"; //static and final variables
	
	void method1();    //abstract method
	
	default void m1() {       //default method
		System.out.println("Hello java");
	}
	
	static void m2() {      //static method
		System.out.println("Hello python");
	}

	
}

class B implements Test{
	
	public void method1() {
		System.out.println("I'm implemeneted");
	}
	
	void triangle() {
		System.out.println("I'm triangle");     //this method belongs to Class B alone, not belongs to interface
	}
}


public class InterfaceDemo  {

	public static void main(String[] args) {
	 
		//Scenario01
		B obj = new B();     //Created object with class type variable , normally as usual
		System.out.println(Test.a); //As it is a static variable, object no needed , with Interface name we can directly access
		System.out.println(Test.b); //As it is a static variable, object no needed , with Interface name we can directly access
        obj.m1();
        obj.method1();
        Test.m2();     //As it is a static method, object no needed , with Interface name we can directly access
        obj.triangle();
       
		//Scenario02
        Test intobj = new B();     //Created object with Interface type variable , normally as usual
        System.out.println(Test.a); //As it is a static variable, object no needed , with Interface name we can directly access
		System.out.println(Test.b); //As it is a static variable, object no needed , with Interface name we can directly access
        intobj.method1();
        intobj.m1();
        Test.m2(); //As it is a static method, object no needed , with Interface name we can directly access
        //intobj.triangle() --> Here we cannot access triangle method because it belongs to class not the interface

	}

}
