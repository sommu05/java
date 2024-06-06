package day09;

import java.util.Arrays;

public class MutableImmutable {

	public static void main(String[] args) {
		
		
		// mutable - can change
		int a [] = {90,10,20,50,80};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); // mutable we can change
		
		System.out.println(Arrays.toString(a));
		
		
		//immutable - we cannot change
		
		String s = new String("Welcome");
		s.concat(" to Java");  //Immutable - cannot change
		System.out.println(s);   //Welcome
		
		//Here It is mutable 
        s = new String("Welcome");
		String se =  s.concat(" to Java");
		System.out.println(se);   //Welcome to Java
		
		

	}

}
