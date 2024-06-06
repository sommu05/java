package day04;

public class Assignment {

	public static void main(String args[]) {
		
		//Assignment1: Largest of 2 numbers (using ternary operator and if else)
		
		int a=21, b=20;
		int x = (a>b) ? a:b;
		System.out.println("Largest number is: "+ x);  
		
//		if(a>b) {
//			System.out.println("a is largest");
//		}
//		else {
//			System.out.println("b is largest");
//		}
		
		
		//Assignment2: Smallest of 3 numbers
		int e=10, f=20, g=5;
		
	    if(e<f && e<g) {
	    	System.out.println("e is the smallest number");
	    }
	    else if(f<e && f<g) {
	    	System.out.println("e is the smallest number");
	    }
	    else {
	    	System.out.println("g is the smallest number");
	    }
	    
	    
	    //Assignment3: Find day number with day names
	    String day = "Monday";
		
		switch(day) {	
		case "Sunday": System.out.println(1); break;
		case "Monday": System.out.println(2); break;
		case "Tuesday": System.out.println(3); break;
		case "Wednesday": System.out.println(4); break;
		case "Thursday": System.out.println(5); break;
		case "Friday": System.out.println(6); break;
		case "Saturday": System.out.println(7); break;
		default : System.out.println("Invalid week name");
		}
	    
		
				
		
		
		
		
		
		
		
	}
}
