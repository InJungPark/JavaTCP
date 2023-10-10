public class TPC35 {
	
	public static void main(String[] args) {

		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		if(str1 == str2) {
			System.out.println("YES");
		}else {
		    System.out.println("NO"); // V	
		}
		
		if(str1.equals(str2)) {
			System.out.println("YES"); // V
		}else {
			System.out.println("NO");
		}
		
		// -------------------------------------------
		
		String str3 = "APPLE"; // heap 메모리 위치가 같으니까 같다고 나오겠지?(아직은 잘 이해가 안된다)
		String str4 = "APPLE";
		
		if(str3 == str4) {
			System.out.println("YES"); // V
		}else {
		    System.out.println("NO");	
		}

		// 결론. string 문자열 비교는 equals() 메서드를 통해 해야한다
		
		if(str3.equals(str4)) {
			System.out.println("YES"); // V
		}else {
			System.out.println("NO");
		}
		
	}
	
}