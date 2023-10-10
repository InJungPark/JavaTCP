package kr.bit;

// 책(객체) -> 제목, 가격, 출판사, 페이지 수...(상태정보) + (행위정보 : 동작 = 메서드)
public class Book {
	// VO : 데이터를 담기 위한 객체 Value Object
    // 또는 DTO : Data Transfer Object
	
	// 상태정보
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 행위정보 : 동작 + 메서드 
}
