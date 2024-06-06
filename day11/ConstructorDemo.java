package day11;

public class ConstructorDemo {

	int a;
	String name;
	
	
	
	ConstructorDemo(){          //default Constructor
	a=50;
	name="Sommu";
  
	}
	
	ConstructorDemo(int sa, String sname){     //Parameterised Constructor
	 a=sa;
	 name=sname;
		
	}
	
	void display() {
		System.out.println(name + " got " + a + " marks");
	}
	
	
	

	public static void main(String[] args) {
       
//		ConstructorDemo cd = new ConstructorDemo();
//		cd.display();
		
		ConstructorDemo cd = new ConstructorDemo(100,"Sommu Alagappan");
		cd.display();
		
		//When you don't pass arguments, default constructor will invoked.
		//When you pass arguments, Parameterised Constructor will be invoked.
	}

}
