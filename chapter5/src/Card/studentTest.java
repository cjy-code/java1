package Card;

import StaticEx.student;

public class studentTest {
	
	public static void main(String[] args) {
		
		student studentLee = new student("Lee");
		System.out.println(studentLee.SerialNum);
		
		student studentKim = new student("Kim");
		
		System.out.println(studentKim.SerialNum);
		System.out.println(studentLee.SerialNum);

		System.out.println(studentLee.getStudentId());
		System.out.println(studentKim.getStudentId());
	}
    
}
