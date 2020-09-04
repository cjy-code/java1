package test;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("정렬방식을 선택 하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeaSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'b' || ch=='B') {
			sort = new BubbleSort();
		}
		else if(ch == 'h' || ch=='H') {
			sort = new HeaSort();
		}
		else if(ch == 'q' || ch=='Q') {
			sort = new QuickSort();
		}
		else{
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}
}