import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	
	public static void main(String[] args) {
	
		 // 관계를 이해하기, 기본자료형 PDT vs 사용자 정의 자료형 UDDT
		 // 정수 1개를 저장하기 위한 변수를 선언하기
		
		 // int a;  // a는 10이 객체가 아니기 때문에 변수
		 // a = 10;
		 
		 // 책 1권을 저장하기위한 변수를 선언하기
		 Book b; 
		 b = new Book(); // () : 생성자 함수 // b는 객체다
		 
		// 데이터의 실체 : 인스턴스
		 b.title = "자바"; 
		 b.price = 15000;
 		 b.company = "한빛미디어"; 
 		 b.page = 700;
 		 
         System.out.print(b.title + "\t"); 
         System.out.print(b.price + "\t");
		 System.out.print(b.company + "\t"); 
		 System.out.println(b.page);
		  
		 PersonVO p; 
		 p = new PersonVO(); // □ □ □ □ 이렇게 구조가 생성 된다고 한다
		 p.name = "정성"; 
		 p.age = 40; 
		 p.weight = 68.4f;
		 p.height = 175.7f;
		 
		 System.out.print(p.name + "\t"); 
		 System.out.print(p.age + "\t");
		 System.out.print(p.weight + "\t"); 
		 System.out.println(p.height + "\t");
		 
	}

}