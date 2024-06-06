package day14;

import java.util.Arrays;

public class PassingParametersToMainMethods {
	
	
	public static void main(String[] args) {
		

		System.out.println(args.length);   //3    //initially it gives 0 because no arguments passed 
		                                   //After Space In String array every word considered as one length , we put comma normally in {"cat","ball","apple"}
		
		System.out.println(args[0]);  //welcome     from"Welcome to Java" a[0] is welcome
		
		System.out.println(Arrays.toString(args));    //[Welcome to Java]
		
		for(String x:args) {
			System.out.println(x);
			//Welcome
			//to
			//Java
		}
		
		
		
		
		
		

	}

}
