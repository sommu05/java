package day15;

class Test2{
	
	final void display() {
		System.out.println("Hello Java");	
		}	
}

class Test3 extends Test2{
	
//	void display() {
//		System.out.println("Hello Java Selenium");	//just overridden the display method before final keyword implemented
//		}	
	
	void display(int a) {
		System.out.println("Hello Java " + a); //overload so possible in final keyword
	}
}


public class Finalkeyword2 {

	public static void main(String[] args) {
		Test3 obj = new Test3();
		obj.display(5);          //Even though we have final keyword in parent class method, we can access the method in parent class through child class object, only we cannot override the method in child class.
		

	}

}
