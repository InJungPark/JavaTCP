import kr.tpc.*;

public class TPC22 {
	
	public static void main(String[] args) {
        // 객체 형 변환 : 상속 관계에 있는 클래스들 간의 형(data type)을 바꾸는 것
        // upcasting, downcasting
		
       // Upcasting
	   // Cat ani = new Cat();
	   // Object ani = new Cat(); // 이것도 가능
		Animal ani = new Cat(); // Upcasting
		ani.eat(); // 컴파일 시점에서는 Animal이지만, 실행 시점에선 Cat
		
		// ani.night(); // animal에는 없으니까 에러
		// Cat c = (Cat)ani; // Downcasting
		// c.night();
		((Cat)ani).night(); // Downcasting
		
		ani = new Dog();
		ani.eat();
		// 여기서 다형성 개념이 나옴
		// 상위클래스가 하위클래스에게 동일한 메세지로 서로다르게 동작시키는 원리 
		// -> 그럼 어떤 경우에 활용하는가?
		
		Object o = new Dog();
		// o.eat();
		((Dog)o).eat();

	}

}