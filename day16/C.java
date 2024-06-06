package day16;

public class C extends C2 implements Interface1,Interface2{

	 public void m1() {
		    System.out.println("Hello java");	
		    }
	 
	 
	 public void m2() {
		    System.out.println("Hello Selenium");	
		    }
	
	
	public static void main(String[] args) {
      
		C obj = new C();
		obj.m1();
		obj.m2();
		System.out.println(Interface1.a);
		System.out.println(Interface2.b);
		
		System.out.println(obj.cd);
		obj.m3();
   
		
	}

}
