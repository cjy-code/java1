package cooperaiton;

public class TakeTransTest {
	
	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentE = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwaygreen = new Subway(2);
		Subway subwayblue = new Subway(4);
		Texy kakaotexy = new Texy(1234);
		
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwaygreen);
		studentE.takeTexy(kakaotexy);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwaygreen.showSubwayInfo();
		kakaotexy.showTexyInfo();
	}

}
