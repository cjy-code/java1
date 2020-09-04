package lambda;

interface PrintString{ 
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		PrintString lambdastr = s-> System.out.println(s);
		lambdastr.showString("TEST");
	
        showMyString(lambdastr);
        
        PrintString test = returnString();
        test.showString("TEST3");
  	}
 
	public static void showMyString(PrintString p ) { 
		p.showString("TEST2");
	}
	
	public static  PrintString returnString() {
		return s-> System.out.println(s + "!!!");
	}
	 
}
