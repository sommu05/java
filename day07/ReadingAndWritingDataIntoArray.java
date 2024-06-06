package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
	
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Enter the value for the position " + i + ":" );
			a[i]  = sc.nextInt();
			
		}
		System.out.println("Printing array Elements");
		System.out.println(Arrays.toString(a));
		
		//Another way instead of using Array.toString(a), using forEach loop, now a has all 5 values so with foreach loop we are printing the x which has all the a values
//		for(int x:a) {
//			System.out.println(x);
//		}		

	}
}

