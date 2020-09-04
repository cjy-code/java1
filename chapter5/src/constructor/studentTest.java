package constructor;

public class studentTest {
	
	public static void main(String[] args) {
		
	
	student studentLee = new student("이순신");
	//studentLee.studentName = "이순신";
	studentLee.address = "서울";
	
	studentLee.showStudentInfo();
	
	student studentKim = new student(100, "김유신");
	//studentKim.studentName= "김유신";
	studentKim.address= "경주";
	
	studentKim.showStudentInfo();
	}
    
}
