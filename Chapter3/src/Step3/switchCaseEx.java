package Step3;

import java.util.Scanner;

public class switchCaseEx {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalcolor;
		
		switch(rank) {
			case 1: medalcolor = 'G';
			System.out.println("금메달");
			break;
			case 2: medalcolor = 'S';
			System.out.println("은메달");
			break;
			case 3: medalcolor = 'B';
			System.out.println("동메달");
			break;
			default :medalcolor ='A';
			
			
	
		}

		System.out.println(rank + "등은 " + medalcolor + "메달입니다");
	}

}
