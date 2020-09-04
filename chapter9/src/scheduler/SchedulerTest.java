package scheduler;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		
		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���");
		System.out.println("R: �Ѹ��� ���ʴ��");
		System.out.println("L: ��Ⱑ ���� ���� �켱");
		System.out.println("P: �켱����ϰ� ���� �����켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if( ch == 'R' || ch =='r') {
			scheduler = new RoundRobin();
		}
		else if ( ch == 'L' || ch =='l') {
			scheduler = new LeastJop();
		}
		else if ( ch == 'P' || ch =='p') {
			scheduler = new PriorityAllocation();
		}
		else  {
		    System.out.println("�������� �ʴ� ����Դϴ�.");
		    return;
		}
		
		
		scheduler.getNextCall();
		scheduler.sendCalltoAgent();
	}

}