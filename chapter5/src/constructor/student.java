package constructor;

public class student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public student(String name) {
		studentName = name;
		}
	
	public student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		
	}
	
	
	public void showStudentInfo() { 
		System.out.println(studentName + "," + address);
		
	}
    
	public String getStudentName() {
		return studentName;
	}
}
 