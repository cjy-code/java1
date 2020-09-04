package reference;

public class studentTest {
	
	public static void main(String[] args) {
		
		student studentLee= new student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		
		student studentKiM= new student(100, "Kim");
		studentKiM.setKoreaSubject("국어", 100);
		studentKiM.setMathSubject("수학", 95);
		
		studentLee.showstudentScore();
		studentKiM.showstudentScore();
	
	}

}
