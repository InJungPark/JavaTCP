import kr.tpc.BookDTO;

public class TPC10 {
	
	public static void main(String[] args) {
		// 기본 자료형 VS 사용자정의 자료형
		// 객체 생성 과정 : 생성자 메서드(new)에 의해 객체로써 heap 메모리에 생성된다
		
		// int, float, char, boolean -> PDT
		// ex) BookDTO b = new BookDTO(); 가 있을 때
        // b, this도 이 객체를 가리킨다 (this 라는 이 클래스를 가리키는 객체가 만들어지는 것)
		int a;
		a = 10;
		
		// 책(BookDTO)이라는 자료형을 써보자 -> class
		// 객체생성 -- 생성자 메서드가 객체 생성 작업
		BookDTO b = new BookDTO();
		
		// 값을 넣는 작업
		b.title = "자바";
		b.price = 17000;
		b.company = "출판사";
		b.page = 670;
	   
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page + "\t");
	   
	}

}
