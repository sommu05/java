package day15;

public class Overloading_Overriding_in_Static_Main {

	public static void main(String[] args) {
	
		System.out.println(Overloading_Overriding_in_Static.a); //100
		
		
		Overloading_Overriding_in_Static obj = new Overloading_Overriding_in_Static();
		obj.a = 200; //We can able to change the value of the variable even with Static keyword
		System.out.println(Overloading_Overriding_in_Static.a); //200
		
		Overloading_Overriding_in_Static obj1 = new Overloading_Overriding_in_Static();
		obj1.a = 300;
		System.out.println(Overloading_Overriding_in_Static.a); //300
		
		obj1.b = 300;  //non static variable ,normally we can change the value of the variable through object.
		System.out.println(obj1.b); //300 
		
		Overloading_Overriding_in_Static.m1(50);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
