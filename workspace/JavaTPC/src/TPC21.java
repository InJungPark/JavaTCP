import kr.tpc.*;

public class TPC21 {

	public static void main(String[] args) {
        // 상속 관계에서 객체 생성 방법 - 상위 클래스(부모)를 활용하라

        // 부모 클래스를 이용하지 않는 방식(직접 이용) < 부모 클래스를 이용하는 방식(하위 클래스의 동작 방식을 모를 때, 간접 이용)
        // Dog d = new Dog(); 
		// Animal d = new Dog();

       Dog d = new Dog();
       d.eat();
       
       Cat c = new Cat();
       c.eat();
       c.night();
       
       // Dog.class, Cat.class
       // Upcasting
       Animal ani = new Dog(); // Upcasting //animal이 먼저 만들어지고...
       ani.eat(); // 다형성
       
       ani = new Cat(); // Upcasting
       ani.eat(); //다형성
       // ani.night(); // 부모한테 없어서 에러
       // Cat cc = (Cat)ani;
       // cc.night();
       ((Cat)ani).night(); // Downcasting : 모지만 자식 타입으로 바뀔 수 있어

	}

}