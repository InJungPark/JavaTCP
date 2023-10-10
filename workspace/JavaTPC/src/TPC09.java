public class TPC09 {
	
	public static void main(String[] args) {
       int a = 56;
       int b = 40;
       // a + b = ?
       // int v = sum(a, b); static이 아니므로 호출할 수 없다
       // non static의 경우 객체를 메모리에 생성해야 한다
       TPC09 tpc = new TPC09(); // heap Area
       int v = tpc.sum(a, b);
       System.out.println(v); // 96
	}	
	
	// static 없는 경우
	public int sum(int a, int b) {
		int v = a + b;
		return v;
		
	}

}
