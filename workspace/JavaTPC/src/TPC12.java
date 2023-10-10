import kr.tpc.BookVO;

public class TPC12 {
	
	public static void main(String[] args) {
		/**
		생성자 메서드 : 객체 생성+초기화

		1. 객체를 생성할 때 사용되는 메서드
		2. 객체 생성 후 객체의 초기화 하는 역할 수행
		3. 특징
	  	- 클래스 이름과 동일한 메서드
	  	- 메서드의 return type 이 없다 ( void 아님)
	  	- public 접근 권한을 가진다. (private도 있긴 함)
	  	- 생성자가 없을 때는 기본 생성자가 만들어 진다.
	  	- 중복정의 가능
		 **/
		
	  // 생성자 -> 생성 + 초기화 -> 중복정의
	  BookVO b1 = new BookVO();
	  
	  // b1.title = "오라클";
	  System.out.print(b1.title + "\t");
	  System.out.print(b1.price + "\t");
	  System.out.print(b1.company + "\t");
	  System.out.println(b1.page);
	  
	  BookVO b2 = new BookVO();
	  System.out.print(b2.title + "\t");
	  System.out.print(b2.price + "\t");
	  System.out.print(b2.company + "\t");
	  System.out.println(b2.page);
	  
	  BookVO b3 = new BookVO("Python", 18000, "대림", 920);
	  System.out.print(b3.title + "\t");
	  System.out.print(b3.price + "\t");
	  System.out.print(b3.company + "\t");
	  System.out.println(b3.page);
	  
	}
	
}