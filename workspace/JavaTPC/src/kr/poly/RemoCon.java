package kr.poly;

public interface RemoCon { 
	// 객체생성X : RemoCon r=new RemoCon(); 안된다는 소리
   
	// final static(상수)를 사용가능
	public int MAXCH = 100; // RemoCon.MAXCH 이런 식으로 접근
	public final static int MINCH = 1;  // RemoCon.MINCH
   
	// 추상 메서드
	public void chUp(); // 인터페이스에선 암묵적으로 abstract
	public void chDown();
	public void internet() ;

}