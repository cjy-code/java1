package cooperaiton;

public class Subway {
	
	int LineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.LineNumber = lineNumber;
		
	}
	
	public void take(int money) {
		this.money +=money;
		passengerCount++;
		
	}
	
	
	public void showSubwayInfo() {
		System.out.println(LineNumber + "¹ø ÁöÇÏÃ¶ÀÇ ½Â°´Àº " + passengerCount + "¸íÀÌ°í, ½Â°´Àº" + passengerCount + "¸í ÀÔ´Ï´Ù.");
	}

}
