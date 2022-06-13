package ex;

public class Ex04 {

	public static void main(String[] args) {
		
		// A 이면 소고기
		// B 이면 삼겹살
		// C 이면 치킨
		// 그외면 라면

		char grade = 'A';
		
		switch(grade) {
		case 'A' : 
			System.out.println("소고기 먹자");
			break;
			
		case 'B' :
			System.out.println("삼겹살 먹자");
			break;
			
		case 'C' : 
			System.out.println("치킨 먹자");
			break;
		default : 
			System.out.println("라면 먹자");
		}
		
		// A,B이면 삼겹살 C이면 치킨 그외 라면
		
		switch (grade) {
		case 'A' :
		case 'B' :
			System.out.println("삼겹살");
			break;
		case 'C' :
			System.out.println("치킨");
			break;
		default : 
			System.out.println("라면");
		}
		
	}

}
