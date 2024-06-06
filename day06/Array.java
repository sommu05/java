package day06;

public class Array {

	public static void main(String[] args) {
		
		/*l) Declare an array
	    2) add values into array
	    3) Find length of an array
	    4) read single value from an array
	    5) read multiple values from an array*/
		
		//Approach01
		int a[] =  new int[3];    //declaration
		
		a[0] = 100;         //assignment/adding values to array//assign the data
		a[1] = 200;
		a[2] = 300;
		
		//Approach02
		
		int b[] = {100,200,300,400,500};    //declaration&assignment
		
		//Find length of an array
		System.out.println(a.length); //3
		System.out.println(b.length); //5
		
		//read single value from an array
		System.out.println(a[0]);
		
		//read multiple/all values from an array
		//Normal forloop
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);       //100 200 300 400 500
		} 
		
		
//		int c[] = {}; // Array is created but no position, no values - empty array
//        System.out.println("The Length of the array: "+ c.length);
//        System.out.println(c[0]); // Index 0 out of bound exception because no value stored in 0th index
		
		//Enhanced forloop / Foreach loop
		
		for (int x:b) {
			System.out.println(x);  //100 200 300 400 500
		}
		
		
		
		
		
		
		
		
		
		
	}

}
