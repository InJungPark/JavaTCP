import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	public static void main(String[] args) {
	// Dog, Cat --> Animal
      
	   Dog d = new Dog();
	   d.eat();
	   
	   Cat c = new Cat();
	   c.eat();
	   
	   /**
	   // Animal <-- Dog.class, Cat.class
	   Animal ani = new Dog();
	   ani.eat();
	   
	   ani = new Cat();
	   ani.eat();
	   **/
	   // 주의 : 상속은 포함관계 아님, 자식이 부모가 가지고 있는 걸 활용할 수 있는 것.
	   
	   // Dog.java(X), Dog.class(o)
	   // Dog dd = new Dog();
	   
	   // Animal <-- [Dog.class, Cat.class]
	   // Dog dd = new Dog();
	   // dd.eat();
	   
	}
	
}