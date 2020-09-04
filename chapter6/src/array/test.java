package array;

public class test {
	public static void main(String[] args) {
		
		char[] arr = new char[28];
		char arpahbet = 'A';
		
		for(int i=0; i<arr.length; i++) {
		arr[i] = arpahbet ++;	
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+","+ (int)arr[i]);
		}
		
	}
}
