package day15;

class ABC{
	
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int a) {
		System.out.println(a*a);
	}
}

class XYZ extends ABC{
	
	void m1(int a) {             //Overriding 
		System.out.println("Pass mark is " + a);  
	}
	
	void m2(int a) {            //Overriding 
		System.out.println(a*a*a);
	}
	  
	void m2(double a) {          //Overloading
		System.out.println(a*a);    
	}
	
}

//Here how many methods are available in XYZ class- 3 methods only, if a method is overridden in the subclass, object for the subclass(XYZ) shows only the new implemented method not the old one 
//If the m2 method is not overridden, in obj2. it shows me the m2 method from the parent class  
//If you pass params in the method from obj, if the method is not overridden, Super class method will received the params, if its overridden subclass method will receive the params 


//So here 2 overridden methods + one overloaded method -- Totally 3 methods

//One method(m2) is overloaded as well as overridden.
//there is no rule like  if you override we cannot overload like if you overload we cannot override there is no rule like this depends on our requirement


public class MethodOverloading_vs_MethodOverriding {

	public static void main(String[] args) {
		
		ABC obj1 = new ABC();
	    obj1.m1(5);
	    obj1.m2(5);
	    
	    XYZ obj2 = new XYZ();
	    obj2.m1(2);
	    obj2.m2(3);
	    obj2.m2(2.5);
	    
	  

	}

}
