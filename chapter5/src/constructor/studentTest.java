package constructor;

public class studentTest {
	
	public static void main(String[] args) {
		
	
	student studentLee = new student("�̼���");
	//studentLee.studentName = "�̼���";
	studentLee.address = "����";
	
	studentLee.showStudentInfo();
	
	student studentKim = new student(100, "������");
	//studentKim.studentName= "������";
	studentKim.address= "����";
	
	studentKim.showStudentInfo();
	}
    
}
