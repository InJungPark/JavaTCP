import kr.tpc.MemberVO;

public class TPC15 {
	
	public static void main(String[] args) {
		
		// 잘 설계된 클래스
		
		// 정보 은닉 : 다른 객체로부터 접근을 막는 것(private)
		// VO, DTO 설계할 때 setter, getter 메서드를 이용해서 설계
		
		 MemberVO m = new MemberVO();
		 //m.name= "홍길동"; // private이라 접근 불가(정보 은닉)
		 // setter method - X
		 System.out.println(m.getName());
		 System.out.println(m.getAge());
         
		 System.out.println(m.toString());
		 
		 MemberVO m1 = new MemberVO();
		 m1.setName("정성");
		 m1.setAge(34);
		 m1.setTel("010-2222-2222");
		 m1.setAddr("서울");
		 
		 System.out.print(m1.getName() + "\t");
		 System.out.print(m1.getAge() + "\t");
		 System.out.print(m1.getTel() + "\t");
		 System.out.println(m1.getAddr());
		 
		 // System.out.println(m1.toString());
		 System.out.println(m1);
		 
	}

}