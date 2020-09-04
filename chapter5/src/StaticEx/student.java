package StaticEx;

public class student {
	
	public static int SerialNum= 1000;
	public int studentID;
	public String studentName;
	public String address;
	
	
	public student(String name) {
		studentName = name;
		SerialNum++;
		studentID = SerialNum;
		
		}
	
	public student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		SerialNum++;
	}
	
	
	public void showStudentInfo() { 
		System.out.println(studentName + "," + address);
		
	}
    
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentId() {
		return studentID;
	}
}
 