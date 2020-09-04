package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {
	
	public static void main(String[] args) {
		System.out.println("ют╥б : ");
		
		try {
			int i = System.in.read();
			System.out.println(i);
			System.out.print((char)i);
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}

}
