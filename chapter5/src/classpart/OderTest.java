package classpart;

public class OderTest {
    public static void main(String[] args) {
    	
    
	Oder oder= new Oder();
	
	oder.oderId = 2018312001L;
	oder.cutomerId= "abc123";
	oder.date = "2018�� 3�� 12��";
    oder.adress= " ����� �������� ���ǵ��� 20����";
    oder.odernumber = "PD0345-12";
	oder.name = "ȫ�浿";
    
    System.out.println("�ֹ� ��ȣ: " + oder.oderId);
    System.out.println("�ֹ��� ���̵�: " + oder.cutomerId);
    System.out.println("�ֹ� ��¥: " + oder.date);
    System.out.println("�ֹ��� �̸�:  " + oder.name);
    System.out.println("�ع� ��ǰ ��ȣ " + oder.odernumber);
    System.out.println("��� �ּ� : " + oder.adress);
    }	
}

