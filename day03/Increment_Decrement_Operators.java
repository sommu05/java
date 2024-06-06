package day03;

public class Increment_Decrement_Operators {

	public static void main(String[] args) {
		//Java Specific Operators 
		// 4) Increment & Decrement operators ++ --
		
		
		//Increment operator
		int a=10;
		
//		a++;
//		System.out.println(a); //11
		
		//case1  -- post increment
//		int result = a++;
//		System.out.println(result); //10
//		System.out.println(a); //11
		
		//case2 -- pre increment
		int res = ++a;
		System.out.println(res); //11
		System.out.println(a); //11
		
		
		
		// Decrement operator
		int b=20;
		
//		b--;
//		System.out.println(b); //19
		
//		int result = b--;  post decrement
//		System.out.println(result); // 20
//		System.out.println(b);// 19
		
		int res1 = --b;     //pre decrement
		System.out.println(res1); //19
		System.out.println(b); //19
		

	}

}
