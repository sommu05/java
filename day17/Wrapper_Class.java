package day17;

import java.util.ArrayList;

public class Wrapper_Class {

	
	public static void main(String[] args) {
        
		//String to int
		
//		String s = "welcome";        // not possible
//		int se = Integer.parseInt(s);
//		System.out.println(se);        //NumberFormatException 
		
		String s1 = "10";
		String s2 = "20";
		int se  = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(se);
		
		
		
		//String to double
		String s3 = "10.50";
		System.out.println(Double.parseDouble(s3));
		
		
		
		//String to Boolean
		String s4 = "true";
		System.out.println(Boolean.parseBoolean(s4));    //true
		
		String s5 = "false";
		System.out.println(Boolean.parseBoolean(s5));   //false
		
		String s6 = "True";
		System.out.println(Boolean.parseBoolean(s6));   //true
		
		String s7 = "Welcome";
		System.out.println(Boolean.parseBoolean(s7));  //false
		
		//other than true if you pass any string that will return false in Boolean wrapper class.
		
		
		//String to char    - Not possible
		
		
		
//Here I'm converting the String to arrayofCharacters not character
//If i use toCharArray I can convert everything into char in a array format at a single shot 
		String s8 = "Ab";
		char si [] = s8.toCharArray();
		System.out.println(si[0]);    //A


//Here I'm converting the String to character using charAt() method
//If i use charAt Here I can convert only one character in a String at a time
		String s9 = "AE";
		char firstchar = s9.charAt(1);
		System.out.println(firstchar);  //E
		
		
		
		//Primitive data types to String
		
		int i = 10;
		double d = 0.5;
		float f = 2.0f;
		char ch = 'Q';
		boolean b = true;
		
		
		System.out.println(String.valueOf(i)); //10
		System.out.println(String.valueOf(d)); //0.5
		System.out.println(String.valueOf(f)); //2.0
		System.out.println(String.valueOf(ch)); // Q
		System.out.println(String.valueOf(b)); //true
		
		
		
		
		//Collections
		ArrayList arr = new ArrayList();       //allows heterogenous data
		ArrayList<Integer> arre = new ArrayList<Integer>();  //allows homogeneous data
		
		
		
		
		
		
		
		

	}

}
