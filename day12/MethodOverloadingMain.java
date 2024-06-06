package day12;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		
		MethodOverloading mdobj = new MethodOverloading();
		
		mdobj.add();
		mdobj.add(30,20);
		mdobj.add(30,20.5);
		mdobj.add(20.8,32);
		mdobj.add(5,5,6);

	}

}
