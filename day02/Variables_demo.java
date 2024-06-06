package day02;

public class Variables_demo {

	public static void main(String[] args) {
		
		int a; //declaration
		a=100; //assignment
        System.out.println(a);
		
		int b = 200;  //declaration+assignment
		System.out.println(b);
		
		b=300;
		System.out.println(b);
		
		
		//Approach 01 - if all the variables belongs to different data types
		
		int hi = 100;
		String hell = "hello";
		char ac = 'a';
		
		
		System.out.println(hi);
		System.out.println(hell);
		System.out.println(ac);
		System.out.println(hi+" "+hell);
		
		
		//Approach 02 - if all the variables belongs to same data types
		
		int e,f,g;    //declaring together and assigning the values separately
		e=100;
		f=52;
		g=85;
		System.out.println(e + " " + f + " " + g); //100 52 85       all 3 vales in one single line
		
				
		//Approach 03 - if all the variables belongs to same data types
		
		int z=100, y=200, x=300;     //declaring and assigning the values together
		System.out.println(z+y+x);
		System.out.println("the value of z: "+ z);
		System.out.println("the value of y: "+ y);
		System.out.println("the value of x: "+ x);
		
				
		
		
		
	}
}
