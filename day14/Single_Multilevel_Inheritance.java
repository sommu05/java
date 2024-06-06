package day14;



class A {
	
	int a;
	void display(){
		System.out.println(a);	
	}
	
}

class B extends A{                //Single Inheritance
	
	int b;
	void show() {
		System.out.println(b);           
	}
}

class C extends B{                 //Multilevel Inheritance
	
	String ab;
	void print() {
		System.out.println(ab);
	}
}
	
	
public class Single_Multilevel_Inheritance {
	public static void main(String[] args) {
       A aobj = new A();
       aobj.a = 100;
       aobj.display();    //100
       
       B bobj = new B();
       bobj.b = 50;
       bobj.a = 500;
       bobj.display();   //50
       bobj.show();      //500
       
       C cobj = new C();
       cobj.a = 250;
       cobj.b = 750;
       cobj.ab = "Java";
       cobj.display();
       cobj.show();
       cobj.print();
       
		

	}

}
