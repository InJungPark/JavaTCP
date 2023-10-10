import kr.tpc.BookDTO;

public class TPC13 {
	
	public static void main(String[] args) {
		/**
	    [ class, object, instance 상호관계 ]

		객체를 부르는 용어들이 다를 수 있다.
		(사실상 인스턴스를 만드는 과정)

		- Class : 객체 설계 도구
		- Object : 객체 변수들을 부르는 이름
		- Instance : 객체가 생성된 다음, 객체가 구체적인 대상체를 가리키는 것
	 	ex) BookDTO b1;
	     	여기서 b1은 인스턴스

		=> 인스턴스가 만들어져야 데이터를 넣고 뺄 수 있다

		class로 만든 새로운 자료형 = 바구니 = 이동
		DTO : Data Transfer Object
		VO : Value Object
	     **/
		
      // 책 -> class(BookDTO) -> 객체 -> 인스턴스
	  String title = "스프링";
	  int price = 25000;
	  String company = "제이펍";
	  int page = 890;
	  // 이렇게만 선언한다면 Book이 아니다 => 담는 과정이 필요하다
	  
	  BookDTO dto; // dto(Object : 객체)
	  dto = new BookDTO(title, price, company, page); // dto(= Instance : 인스턴스)
	  
	  bookPrint(dto);  

	}	
	public static void bookPrint(BookDTO  dto) {
		System.out.print(dto.title + "\t");		
		System.out.print(dto.price + "\t");
		System.out.print(dto.company + "\t");
		System.out.print(dto.page + "\t");
		
	}
	
}