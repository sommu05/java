package day18;

import java.util.InputMismatchException;

public class Finallyblock {

	public static void main(String[] args) {
	
//casel: Exception occured, catch block handled ---> finally block will execute	
/*		String c = null;
		try {
		System.out.println(c.length());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		finally {
			System.out.println("Program entered into finally block");
		}    */
		
//case2: Exception occured, catch block NOT handled --> finally block will execute
		
/*		String c = null;
		try {
		System.out.println(c.length());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		
		}
		finally {
			System.out.println("Program entered into finally block");
		}   */
		
		
		
//case3: Exception does not occured, catch block ignored ----> finally block will execute		
		String c = "12345";
		try {
		System.out.println(c.length());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
		finally {
			System.out.println("Program entered into finally block");
		}  
		
		
		
		
		
		
		
		
		
	}
		

}
