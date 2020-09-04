package step4;

public class 구구단 {
	
	public static void main(String[] args) {
		//짝수 단만 출력, 단보다 곱하는 수가 작을 떄
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

