package kr.tpc;

public class Inflearn {
   private Inflearn() { // 생성자 메서드가 private이면 모든 멤버는 static 붙은 멤버가 되어야 한다
   }

   // 인스턴스메서드	
   public static void tpc() { 
	   System.out.println("TPC강의 너무 재미있다.");
   }
   
   // 클래스메서드
   public static void java() {
	   System.out.println("Java강의 너무 재미있다.");
   }
   
}