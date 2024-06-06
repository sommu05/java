package day13;

public class StaticKeywordMain {

public static void main(String[] args) {
		
		System.out.println(Statickeyword.a);
		Statickeyword.m1();
		
//		System.out.println(b);   //cannot access non static variable
//		m2();       //cannot access non static method
		
		Statickeyword obj = new Statickeyword();
		System.out.println(obj.b);
		obj.m2();
		
		obj.m();
		

	}


}
