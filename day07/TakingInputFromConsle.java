package day07;

import java.util.Scanner;

public class TakingInputFromConsle {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        System.out.println("Give number is: " + num);
        
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value: ");       //10.5
//        double dec = sc.nextDouble();
//        System.out.println("Give number is: " + dec);   //10.5    
        		
        
        System.out.println("Enter your city: ");       //john
        String str = sc.next();
        System.out.println("Your city is " + str);   //john    
        
        
	}

}
