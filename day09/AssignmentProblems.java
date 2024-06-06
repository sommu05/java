package day09;

import java.util.Scanner;

public class AssignmentProblems {

	public static void main(String[] args) {
		
		//Prob 01:Palindrome MADAM
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the output: ");
		
		String se = sc.next();
		String reverse_str = "";
		

		for(int i = se.length()-1 ; i>=0 ; i--) {
			reverse_str = reverse_str + se.charAt(i);
		}
		System.out.println(reverse_str);
		
		if(se.equals(reverse_str)) {
			System.out.println(se + " is Palindrome" );
		}
		else {
			System.out.println(se + " is not Palindrome" );
		}
	}

}
