// import java.lang.*;

public class TPC34 {

	public static void main(String[] args) {
		 // 문자열(String)은 객체다

        // 정석대로라면 이렇게 써야겠지
		// java.lang.String stri= new java.lang.String("APPLE");
		
		// String	012345... index
		
		// 그렇지만, import가 생략되어 있으므로 이렇게 씀
		String str = new String("APPLE");
		String v = str.toLowerCase();
		System.out.println(v); // apple
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PX")); // -1
		System.out.println(str.replaceAll("P", "X")); // AXXLE

	}

}