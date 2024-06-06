package day09;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		//Approach01
		//Logic based 
		
		String s = "Selenium";
		
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev = rev + s.charAt(i);
			
		}
		System.out.println(rev);  //emocleW
		//Only 2 methods we need to reverse a string - length,charAt
		
		
		//Approach01
		
		String a = "Concatenation";
		
		String reverse = "";
		
		for(int i=a.length()-1;i>=0;i--) {
			//System.out.println(a.charAt(i)); 
			reverse = reverse + a.charAt(i);
		}
		System.out.println(reverse);
		
		
		//Approach02 -by converting string to char array type 
		//without using charAt() and length() 
		//Logic based
		
		s = "Welcome";
		rev = "";
		
		char revArray[] = s.toCharArray();
		
		for (int i=revArray.length-1 ; i>=0 ; i--) {
		          System.out.println(revArray[i]);	 
		          rev = rev + revArray[i];
		}
		System.out.println(rev);        //emocleW
		
		
		//Approach03 - using String Buffer Class
		//Built in method
		
		StringBuffer d = new StringBuffer("Welcome");
		System.out.println("Reverse String is: " + d.reverse());
		
		//Approach03 - using StringBuilder Class
		//Built in method
				
		StringBuilder e = new StringBuilder("Welcome");
		System.out.println("Reverse String is: " + e.reverse());
		
		
		
		
		
		 
	}

}
