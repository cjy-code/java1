package step4;

public class ������ {
	
	public static void main(String[] args) {
		//¦�� �ܸ� ���, �ܺ��� ���ϴ� ���� ���� ��
		int dan=2;
		int count=1;
		
		for(dan=2; dan <=9; dan++) {
			
			if((dan % 2) == 1)
				continue;
			
			    
			for(count=1; count <=9; count++) {
			
				if(count >dan)  
					break;
		
				
					System.out.println( dan + "X" + count + "=" + dan *count);
				    
			
			
			}	
			System.out.println();
		
	}
}
}

