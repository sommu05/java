package day06;

public class Two_MultiDimensionalArray {

	public static void main(String[] args) {
		/*l) Declare an array
	    2) add values into array
	    3) Find length of an array
	    4) read single value from an array
	    5) read multiple values from an array*/
		
		
		//Approach01
		
		int a[][] = new int[3][2];
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[0][0] = 300;
		a[0][1] = 400;
		
		a[0][0] = 500;
		a[0][1] = 600;
		
		//Approach02
		int b[][] = {  {100,200},
				       {300,400},
				       {500,600}  };
		
		
		//Find length of an array
		System.out.println("The length of rows is: "+ b.length);
		System.out.println("The length of columns is: "+ b[0].length);
		
		
		//read single value from an array
		System.out.println(b[0][1]);   //200
		
		//read multiple values from an array - nested forloop 
		for (int r=0;r<b.length;r++) {
			for(int c=0;c<b[r].length;c++) {                 //b[r] instead of 0th row, r only looping0,1,2,3 here so we putting b[r] - r dynamic value 
				System.out.print(b[r][c] + "  ");
			}
			System.out.println();
		}
		
		//enhanced forloop/foreach loop
		
		for (int arr[]:b) {
			for (int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
