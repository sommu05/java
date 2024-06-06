package day17;

import day17.Test1;

public class Test2 {

	public static void main(String[] args) {
	
	//Default	
		Test1 obj = new Test1();
		System.out.println(obj.b);
		obj.m2();
	
	//Protect
		System.out.println(obj.c);
		obj.m3();
	

}
}