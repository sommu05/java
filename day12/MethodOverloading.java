package day12;

public class MethodOverloading {

	int a = 10;
	int b = 20;
	
	void add(){
		System.out.println(a+b);
	}
	
	void add(int a,int b) {          //definition/declaration
		System.out.println(a+b);     //body is implementation 
	}
	
	void add(int a,double b) {
		System.out.println(a+b);
	}
	
	void add(double b, int a) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c ) {
		System.out.println(a+b);
	}
	
}
