import kr.tpc.*;

public class TPC29 {

	public static void main(String[] args) {
		// Object class의 활용 (다형성 인수, 다형성 배열)
		
		A a = new A();
		display(a);
     
		B b = new B();
		display(b);
	}
	
	private static void display(Object o) { // 다형성 인수
		if(o instanceof A) {
			((A)o).go(); // 쓸 땐 Downcasting 해서
	  } else {
		  ((B)o).go();
	  }
	  
	}
	
}