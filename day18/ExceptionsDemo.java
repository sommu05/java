package day18;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {

		// ArithmeticException

//		int num1 = 100;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a value: ");
//		int input = sc.nextInt();
//
//		int result = num1 / input;
//
//		System.out.println(result);
//		System.out.println("Program Completed");
//		System.out.println("Program Exited");  

		
		
		// ArrayIndexOutOfBoundsException 

//		int arr[] = new int[5];
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the position value: ");
//		int pos = sc.nextInt();
//
//		System.out.println("Enter the value: ");
//		int value = sc.nextInt();
//
//		arr[pos] = value;
//
//		System.out.println("The taken position is " + pos + " and the value is " + value);
//		System.out.println("Program Completed");
//		System.out.println("Program Exited");
		 
		

		// NumberFormatException

//		String s = "welcome";
//
//		int res = Integer.parseInt(s);
//		System.out.println(res);
		
		
		//NullPointerException
		
		String c = "Hello";
		String d = "";
		String e = null;
		System.out.println(c.length());
		System.out.println(d.length());
		System.out.println(e.length());

	}

}
