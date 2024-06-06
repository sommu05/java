package day07;

import java.util.Scanner; 

public class TakingMultipleInputsFromConsole {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Example:01
//		System.out.println("Enter number01: " );
//		int num1 = sc.nextInt();
//		System.out.println("Enter number02: ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("Addition is " + (num1+num2));
		
		
		//Example02:
		System.out.println("Enter your name:" );
		String name = sc.next();
		
		System.out.println("Enter your age:" );
		int age= sc.nextInt();
		
		System.out.println("Enter your emailId:" );
		Object email= sc.next();
		
        System.out.println("You name is: " + name + "Your age is: " + age + "Your eamild is: " + email );
	}

}
