package day12;

public class OverloadMainMethod {

	
	void main() {
		System.out.println("Hello");
	}
	
	void main(int a, int b) {
		System.out.println(a+b);
	}
	
	double main(int a, double b) {
		return  a+b;
	}
	
	
	public static void main(String[] ar) {
		
		OverloadMainMethod ovmObj = new OverloadMainMethod();
		ovmObj.main();
		ovmObj.main(55, 45);
		System.out.println(ovmObj.main(45, 55.5)); 
	}
	
	

}
