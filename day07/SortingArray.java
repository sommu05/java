package day07;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {

		//Example1:
         int a[] = {10,20,50,40,10,20,30};
         
//         for (int value:a) {
//        	 System.out.println(value);}   
         
          System.out.println("Arrays before sorting:" + Arrays.toString(a));    //[10, 20, 50, 40, 10, 20, 30]
         
          Arrays.sort(a);
          
          System.out.println("Arrays after sorting:" + Arrays.toString(a));
          
          
        //Example2:
          
          char b[] = {'f','t','d','b'};
          
          System.out.println("Arrays before sorting:" + Arrays.toString(b));
          
          Arrays.sort(b);
          
          System.out.println("Arrays after sorting:" + Arrays.toString(b));
          
          
          //Example3:
          
          String c[] = {"tyson","sam","Antony","Mark"};
          
          System.out.println("Arrays before sorting:" + Arrays.toString(c));
          
          Arrays.sort(c);
          
          System.out.println("Arrays after sorting:" + Arrays.toString(c));
          
         }
	}


