package cooperaiton;

public class Texy {
	
	int texynumber;
	int passengercount;
	int money;
	

	public Texy(int texyNumber) {
		this.texynumber = texyNumber;
		}
	
	public void take(int money) {
		this.money -= money;
		passengercount++;
	}
	
	public void showTexyInfo() {
		System.out.println(texynumber + "¹ø ÅØ½ÃÀÇ ½Â°´Àº " + passengercount + "¸íÀÌ°í, ½Â°´Àº" + passengercount + "¸í ÀÔ´Ï´Ù.");
	}


}
