package reference;

public class studentTest {
	
	public static void main(String[] args) {
		
		student studentLee= new student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 95);
		
		
		student studentKiM= new student(100, "Kim");
		studentKiM.setKoreaSubject("����", 100);
		studentKiM.setMathSubject("����", 95);
		
		studentLee.showstudentScore();
		studentKiM.showstudentScore();
	
	}

}
