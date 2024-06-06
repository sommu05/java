package day03;

public class Swapping_2numbers {

	public static void main(String args[]) {
//		
//		int a=10 , b=20;
//		System.out.println(a);
//		System.out.println(b);
//		
		//case:1
//		//With temporary variable swapping most commonly used
//		// c=a a=b b=c
//		
//		int c=a;
//		System.out.println(c); //10
//		
//		a=b;
//		b=c;
//		System.out.println("The value of a is: "+ a); //20
//		System.out.println("The value of b is: "+ b); //10
				
		
		//case:2
		//Swapping with arithmetic operators + -
		
//		int a=10, b=20;
//		System.out.println("Before Swapping the values are "+a +" "+b);
//		
//	    a=a+b; //10+20 a value 30
//	    b=a-b; //30-20 b value 10 
//	    a=a-b; //30-10 a value 20 
//		System.out.println("After Swapping the values are "+a +" "+b);
		
		//case:3
		//Swapping with arithmetic operators * /
		// a and b value should not be 0
		
//		int a=10, b=20;
//		System.out.println("Before Swapping the values are "+a +" "+b);
//		
//	    a=a*b; //10*20 a value 200
//	    b=a/b; //200/20 b value 10 
//	    a=a/b; //200/10 a value 20 
//		System.out.println("After Swapping the values are "+a +" "+b);
		
		
		
		//case4 - Swapping with single statement
		//It always executes from right to left
		int a=10, b=20;
		System.out.println("Before Swapping the values are "+a +" "+b);
		b=a+b-(a=b); 
		//1. (a==b) b value 20 will assign to a
		//2. a+b --> 10+20 = 30
		//3. b = 30-20 = 10  now b value is 10
		//4. in the first step a value was assigned as 20
		
		System.out.println("After Swapping the values are "+a +" "+b);
		
		
		//case5 - Swapping 3 numbers for this we need a temporary variable to hold the value
		int x=10, y=20, z=30;
		System.out.println("Before swapping the numbers are "+ x + " " + y + " " + z); //10 20 30 
		
	    int o=x;  //10  //  Store the value of x in o (o = 10)
	    x=y; //20
	    y=z; // 30
	    z=o; //10
	    System.out.println("After swapping the numbers are "+ x + " " + y + " " + z); // 20 30 10 
	    

		
	}
	
}
