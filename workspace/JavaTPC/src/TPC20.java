import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
        // Override (재정의) : 동적 바인딩(호출될 메서드가 '실행'시점에서 결정되는 바인딩)
        //   -> 프로그램 속도 저하의 원인이 되지만 이점이 더 크기 때문에 사용
        // 오버라이드를 통해 하위 클래스에 접근할 수 있다!
		
     // Animal 부모클래스를 사용하지 않음
	 Dog d = new Dog();
	 d.eat(); // ? -> 개처럼 먹는다

	 Cat c=new Cat();
	 c.eat();
	 c.night();
	 
	 // Dog.class, Cat.class
	 Animal ani = new Dog(); // Upcasting(자동형변환)
	 // animal 타입만 있으면 dog 사용 가능
	 ani.eat(); // ? -> 개처럼 먹는다
	 
	 ani=new Cat();
	 ani.eat(); // ? -> 고양이처럼 먹는다
	 // ani.night();
	 ((Cat)ani).night(); // 밤에 눈에서 빛이난다 --> Downcasting(강제형변환)

	}

}