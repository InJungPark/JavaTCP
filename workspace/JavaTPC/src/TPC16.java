import kr.tpc.OverLoad;

public class TPC16 {

	public static void main(String[] args) {
		// 메서드 오버로딩 (= 정적 바인딩 : 컴파일 시점에서 호출될 메서드가 이미 결정되어 있는 바인딩. 속도와는 관계X)
		// 조건 : 같은 이름의 메서드를 여러 개 가지면서, 매개변수의 유형과 개수가 다르도록 하는 기술
		// -> 메서드의 signature 가 다르면 된다(매개변수의 타입, 개수)
		
      // 1 + 1 = ?, 23.4 + 56 = ?, 56.7 + 78.9 = ?
      OverLoad ov = new OverLoad();
      ov.hap(20, 50); // ov.hap_int_int(20, 50)
      ov.hap(23.4f, 56); // ov.hap_float_int(23.4f, 56)
      ov.hap(56.7f, 78.9f); // ov.hap_float_float(56.7f, 78.9f)
	
	}

}