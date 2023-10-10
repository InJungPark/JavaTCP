public class TPC02 {
	
	public static void main(String[] args) {
     
	   // 프로그래밍의 3대요소 : 변수, 자료형(DataType), 할당(=)
	   // 변수 = 기억 공간 (크기, 어떤 종류의 데이터를 저장할 것인가?)
       // 자료형 = 변수의 크기와 변수에 저장되리 데이터의 종류를 결정하는 것
       // 변수를 '선언'해야 기억공간이 만들어 진다
		
		// 1 + 1 = 2
		// 선언 : 메모리에 변수(기억 공간)을 만드는 것
	    int a, b, c; // int : 자료형 (크기-4byte)
	    
	    // 할당: 변수에 값을 저장(대입, 할당)하는 것
	    a = 1; 
	    b = 1;
	    c = a + b; // 2
	    System.out.println(c);
	   
	    float f; // float, double
	    f = 34.5f;
	    System.out.println(f);
	   
	    char d;
	    d = 'A';
	    System.out.println(d);
	   
	    boolean g;
	    g = true; // false(거짓), true(참)
	   
	    // Book bk; - 사용자 정의 자료형. Book 클래스를 만들면 된다
	    System.out.println(g);
	 
	    // 새로운 자료형을 만드는 도구 : 클래스 => 객체지향
	   
	}
	
}