package array;

public class StudentTest {

	public static void main(String[] args) {
		
		student studentLee = new student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		student studentKim = new student(1002, "Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 80);
		
		studentLee.showStudentInfo();
		System.out.println("===================");
		studentKim.showStudentInfo();

	}

}
