package day18;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		//Example:01
	/*	int num1 = 100;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");

		try {
			int input = sc.nextInt();
			int result = num1 / input;
		} catch (ArithmeticException e) {
			System.out.println("Handled exception");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled exception");
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
        
		System.out.println("Program Completed");
		System.out.println("Program Exited");    */
		
		
		//Example:02
		String c = null;
		try {
		System.out.println(c.length());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}

	}

}
