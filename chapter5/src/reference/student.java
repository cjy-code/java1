package reference;

public class student {
	
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	
	public student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
 		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
    public void showstudentScore() {
    	int total = korea.score + math.score;
    	System.out.println(studentName + "�л��� ������ " + total + "�� �Դϴ�.");
    	
    }
	
}