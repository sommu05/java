package day11;

public class StudentsMain {

	public static void main(String[] args) {

		//Store data using Object reference variable 
          Students stu = new Students();
          stu.sid = 25;
          stu.sage = 18;
          stu.sname = "sommu";
          //stu.printStudentData();
          
          
          //Store the data in the variables through the method
          stu.setStudentData(96, 19, "Dhoni");
          stu.printStudentData();
          
          
          
          
	}

}
