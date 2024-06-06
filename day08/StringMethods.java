package day08;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
 
		String s = "Welcome";
//		String s = new String("Welcome");  //string class object  
		
		//length() - returns length of a string(number of characters)
	    
		int l = s.length();   //store the length in a variable l
	    System.out.println(l);  //7
	
	    System.out.println("TajMahal".length());      //8
	
	    
	    
	    //concat() - joining two or more strings;
	    //concat method we can join at a time only two strings 
	    String s1 = "Welcome ";
	    String s2 = "Java ";
	    System.out.println(s1+s2);
	    System.out.println(s1.concat(s2));
	    
	    String s3 = "Automation";
	    System.out.println(s1+s2+s3);
	    
	    System.out.println(s1.concat(s2).concat(s3));  //we can add one more concat 
	    
	    String se = s1.concat(s2);
	    System.out.println(se.concat(s3));  //store it in variable and concat the third one
	    
	    System.out.println(s1.concat(s2+s3)); //Combination of + and concat this also correct
	    
	    System.out.println("Welcome " + "Java");  //without variables concating the values
	    
	    System.out.println("Welcome ".concat("Sommu"));
	    
	    
	    
	    //trim remove spaces right and left sides
	    
	    String x = "   Welcome   "; 
	    //space is also counted in the length method
	    System.out.println(x);
	    System.out.println(x.length());
	    
	    System.out.println(x.trim());   
	    System.out.println(x.trim().length());
	    
//	    String xe = x.trim();
//	    System.out.println(xe);
//	    System.out.println(xe.length());
	    
	    
	    
	   //charAt()   - returns a character from a string based on index
	    
	    s = "Hello";
	    System.out.println(s.charAt(4));  //o
	    System.out.println(s.charAt(0));  //H
	    
	    
	    
	    //contains()
	    //contains() - basically check a particular string is a part of the main string or not 
	    //contains method always returns a Boolean value
	    //the string values are case sensitive
	    
	    s = "concatenation";
	    System.out.println(s.contains("nation")); //true
	    System.out.println(s.contains("Con"));    //false
	    System.out.println(s.contains("cateon"));  //false
	    
	    
	    
	    //equals() , equalsIgnoreCase() - Compare Strings
	    //always returns a Boolean value
	    //equalsIgnoreCase() ignores the case sensitive
	    
	    s1="welcome";
	    s2="welcome";
	    System.out.println(s1==s2); //true
	    System.out.println(s1.equals(s2)); //true
	    System.out.println(s1.equals("welcome")); //true
	    System.out.println(s1.equals("Welcome")); //false
	    
	    System.out.println(s1.equalsIgnoreCase("Welcome")); //true
	    
	    
	    //replace() - replace single or multiple(sequence) characters in a string
	    
	    //replace single character
	    s1 = "Welcome to Selenium and Python";
	    System.out.println(s1.replace('e', 'x'));
	    
	    System.out.println(s1.replace("Python", "TestNG"));
	    
	    //replace a with x and c with y    - Final answer - xbyxyy
	    s2="abcacc";
	    s3 = s2.replace('a', 'x');
	    System.out.println(s3);
	    System.out.println(s3.replace('c', 'y'));  // xbyxyy
	    
	    //(or) we can do with single line
	    System.out.println(s2.replace('a', 'x').replace('c', 'y')); // xbyxyy
	    
	    
	    //Example:
	    String amt = "$15,20,15";
	    System.out.println(amt.replace("$", "").replace(",", "")); //152015
	    
	    
	    
	    
	    //substring() - extract substring from the main string
	    
	    /*Only for substring follow this thumb rule:
	    Starting index count from 0
	    Ending index count from 1*/
	    
	    s1 = "Selenium";
	    System.out.println(s1.substring(1,5));  //elen
	    System.out.println(s1.substring(0,3));  //Sel
	    
	    
	    
	    //toUpperCase() toLowerCase()
	    s2 = "welcome";
	    System.out.println(s2.toUpperCase()); // WELCOME
	    System.out.println(s2.toLowerCase()); // welcome
	     
	    
	    
	    //split() - split the string into multiple parts based on delimeter
	    
	    s = "abc123@gmail.com";
	    String a[] = s.split("@");     //We are storing this two splited in strings in array variable of String datatype
	    System.out.println(a[0]); //abc123
	    System.out.println(a[1]); //gmail.com
	    
	    System.out.println(Arrays.toString(a)); //[abc123, gmail.com]
	    System.out.println(Arrays.toString(s.split("@")));  // [abc123, gmail.com] this way also correct
	    		  
	    for(String value:a) {
	    	System.out.println(value);
	    }
	    //abc123
	    //gmail.com
	    
	    //Example01:
	    s= "abc&123@gmail.com";
	    String c[] = s.split("@");
	    System.out.println("Answer of c is: " + Arrays.toString(c));   //[abc&123, gmail.com]
	    String d[]=c[0].split("&");
	    System.out.println(Arrays.toString(d));  //[abc, 123]
	    
	    System.out.println(d[0] + d[1] + c[1]); //abc123gmail.com
	    //or
	    System.out.println(d[0]);  //abc
	    System.out.println(d[1]);  //123
	    System.out.println(c[1]);  //gmail.com
	    
	    //Example02: delimeter with space 
	    String ar = "abc 123";
	    System.out.println(Arrays.toString(ar.split(" ")));  //[abc, 123]
	    
	    //Example03
	    String xre = "abc 123 xyz";
	    System.out.println(Arrays.toString(xre.split("\\.")));   //[abc 123 xyz]
	    		
		//Example04: delimeter with space 
	    String are = "abc.123";
	    System.out.println(Arrays.toString(are.split("\\.")));   //[abc, 123]  (If you use only full stop it results is empty array or unexpected elements in array )
	    
	  //Example05: Find john is present or not 
	    String name = "John Kenedy";
	    System.out.println(name.contains("john")); //false
	    System.out.println(name.equalsIgnoreCase("john kenedy")); //true  - Here full character we have to give to compare 
	    
	    //Without using equalsignorecase, we combine multiple string methods and get the output
	    System.out.println(name.replace('J','j').contains("john")); //true
	    System.out.println(name.toLowerCase().contains("john")); //true
	    System.out.println(name.toUpperCase().contains("JOHN")); //true
	    
	    
	}
}
