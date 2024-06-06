package day11;

public class Students {

	int sid;
	int sage;
	String sname;
	
	void printStudentData(){
		System.out.println(sid+ " " + sage + " " + sname);
	}
	
	
	void setStudentData(int id, int age, String name) {
		
		sid = id;
		sage = age;
		sname= name;
		
		
	}
	
	
	
	
	
	
}
