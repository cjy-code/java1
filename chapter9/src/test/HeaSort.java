package test;

public class HeaSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeaSort ascending");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeaSort descending");
		
	}
	
	public void description() {
		Sort.super.description();
		System.out.println("HeaSort ¿‘¥œ¥Ÿ.");
	}

}
