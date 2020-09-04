package classpart;

public class OderTest {
    public static void main(String[] args) {
    	
    
	Oder oder= new Oder();
	
	oder.oderId = 2018312001L;
	oder.cutomerId= "abc123";
	oder.date = "2018년 3월 12일";
    oder.adress= " 서울시 영등포구 여의도동 20번지";
    oder.odernumber = "PD0345-12";
	oder.name = "홍길동";
    
    System.out.println("주문 번호: " + oder.oderId);
    System.out.println("주문자 아이디: " + oder.cutomerId);
    System.out.println("주문 날짜: " + oder.date);
    System.out.println("주문자 이름:  " + oder.name);
    System.out.println("준문 상품 번호 " + oder.odernumber);
    System.out.println("배송 주소 : " + oder.adress);
    }	
}

