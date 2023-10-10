package kr.poly;

public class Dog extends Animal{ // eat() { ? }
  // 이름, 나이, 종 : 상태정보
  // 재정의(override)
 
  public Dog() { // 생성자
	  super(); // new Animal(); 역할과 비슷. 부모에 있는 생성자 호출 역할 하니까 Animal 부터 실행
  }
  
	@Override
	public void eat() {
		System.out.println("개가 먹는다.");
	}   
	
}