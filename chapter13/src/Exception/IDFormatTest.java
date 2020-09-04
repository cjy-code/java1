package Exception;

public class IDFormatTest {
	
	
	private String userID;
	
	public String getUserID( ) {
		return userID;
		
	}
	
	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("���̵��  null �Դϴ�.");
		}
		else if (userID.length() < 8|| userID.length()> 20) {
			throw new IDFormatException("���̵�� 8���� �̻� 20���� ���Ϸ� ������");
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

