package day13;

public class ThisKeyword {

	int num1,num2;
	
	String name1,name2;
	
	//Constructor
	ThisKeyword (String name1, String name2){
		this.name1=name1;
		this.name2=name2;
	}
	
//	//Method
//	void setData(int num1, int num2){
//		this.num1=num1;
//	    this.num2=num2;
//	}
	
	void display() {
//		System.out.println(num1+num2);
		System.out.println(name1+name2);
	}
	

	public static void main(String[] args) {
	
		ThisKeyword obj = new ThisKeyword("Hello ","Java");
		obj.display();          //answer will be nullnull,if we don't use this keyword
	
//		ThisKeyword obj = new ThisKeyword();
//		obj.setData(10, 200);
//		obj.display();           //answer will be 0,if we don't use this keyword

		
	}
//Comment Constructor and Check method and viceversa
	

}
