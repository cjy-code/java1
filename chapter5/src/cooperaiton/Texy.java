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
		System.out.println(texynumber + "�� �ؽ��� �°��� " + passengercount + "���̰�, �°���" + passengercount + "�� �Դϴ�.");
	}


}
