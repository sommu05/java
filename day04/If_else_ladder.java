package day04;

public class If_else_ladder {

	public static void main(String args[]) {
		//Postive, negative and Zero 
		int number = 0;
		
		if(number>0)
		{
			System.out.println("Positive number");
		}
		else if(number<0) {
			System.out.println("Negative number");
			
		}
		else {
			System.out.println("Zero");
		}
		
		
		//Example2
		//Find the largest of 3 numbers
		
		int a=100, b=200, c=500;
		
		if(a>b && a>c) {
			System.out.println("a is the largest number " + a);
		}
		else if(b>a && b>c) {
			System.out.println("b is the largest number " + b);
		}
		else {
			System.out.println("c is the largest number " + c);
		}
			
		
		//Example3   
		//In if condition we can pass the boolean value directly
		if(false) {
			System.out.println("Hello Python");
		}
		else {
			System.out.println("Hello Java");
		}
		
		//Example4
		if(1==2) {
			System.out.println("Hello Python");
		}
		else {
			System.out.println("Hello Java");
		}
		
		
		
		//Example5
		//Day names and day numbers
		
		int daynum=10;
		
		if(daynum==1) {
			System.out.println("Sunday");
		}
		else if(daynum==2) {
			System.out.println("Monday");
		} 
		else if(daynum==3) {
			System.out.println("Tuesday");
		} 
		else if(daynum==4) {
			System.out.println("Wednesday");
		} 
		else if(daynum==5) {
			System.out.println("Thursday");
		} 
		else if(daynum==6) {
			System.out.println("Friday");
		} 
		else if(daynum==7) {
			System.out.println("Saturday");
		} 
		else {
			System.out.println("Invalid week number");
		}
		
		
	}
	
}
