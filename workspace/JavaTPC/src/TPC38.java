import java.util.*;
import kr.tpc.BookDTO;

public class TPC38 {
	
	public static void main(String[] args) {
		 // 크기에 상관없이 객체를 저장 : ArrayList
         // 우리가 만든 ObjectArray api는 길이 제한이 있었다
		
		List<BookDTO> list = new ArrayList<BookDTO>(1); // Object[] --> BookDTO[] // 제네릭
		list.add(new BookDTO("자바", 12000, "이지스", 600));
		list.add(new BookDTO("C언어", 17000, "에이콘", 700));
		list.add(new BookDTO("Python", 15000, "제이펍", 690));
		
		for(int i = 0; i < list.size(); i++) {
			// Object o = list.get(i);
			BookDTO vo = list.get(i);
			System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
		}

	}
	
}