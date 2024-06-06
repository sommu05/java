package day17.pack1;

import day17.Test1;

public class Test3 extends Test1{

	public static void main(String[] args) {
	

   //Protected		
		Test3 obj1 = new Test3();
		System.out.println(obj1.c);
		obj1.m3();
		
	//Public
		Test1 obj2 = new Test1();
		System.out.println(obj2.d);
		obj2.m4();
		
	}

}
