package Exception;

public class IDFormatTest {
	
	
	private String userID;
	
	public String getUserID( ) {
		return userID;
		
	}
	
	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("아이디는  null 입니다.");
		}
		else if (userID.length() < 8|| userID.length()> 20) {
			throw new IDFormatException("아이디는 8글자 이상 20글자 이하로 쓰세요");
		}
		this.userID= userID;
	}
	
	public static void main(String[] args) {
		
		IDFormatTest idtest = new IDFormatTest();
		
		String myid = null;
		
     	try {
			idtest.setUserID( myid);
		} catch (IDFormatException e) {
		
			System.out.println(e);
		}
			
     	myid = "123456";
     			
     	try {
			idtest.setUserID( myid);
		} catch (IDFormatException e) {
		
			System.out.println(e);
		}
      }
	}

