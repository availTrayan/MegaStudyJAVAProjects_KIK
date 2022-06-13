package ex;

import org.w3c.dom.Text;

public class Ex03 {

	public static void main(String[] args) {

		// 문자열 길이 구하기
		
		String text = "Hello";
		int length = text.length();
		System.out.println("길이 : " + length);
	

		// 특정 위치의 문자 구하기
		char alphabet = text.charAt(1);
		System.out.println(alphabet);
		System.out.println(text.charAt(4));
		
		// 문자 하나하나를 통해서 문자열 출력하기
		System.out.println(text);
		
		for(int i = 0; i < text.length(); i++) {
			System.out.println(text.charAt(i) + " ");
		}
		
		// 문자열 자르기
		
		String phoneNumber = "01012345678";
		
		String Numpart1 = phoneNumber.substring(0, 3);
		String Numpart2 = phoneNumber.substring(3, 7);
		String Numpart3 = phoneNumber.substring(7);
		System.out.println(Numpart1 + "-" + Numpart2 + "-" + Numpart3);
		
		// 특정 문자열로 시작하는지?
		// 특정 문자열로 끝나는지?
		
		String name = "안희용";
		// 안씨인지?
		
		if(name.startsWith("안")) {
			System.out.println("맞음");
		} else {
			System.out.println("아님");
		}
		
		// 이름이 희용인지?
		if(name.endsWith("희용")) {
			System.out.println("맞음");
		} else {
			System.out.println("아님");
		}
		
		// 특정 문자열 바꾸기
		// 성을 이씨로 바꾸자
		
		String replaceName = name.replace("안", "이");
		// name = name.replace
		System.out.println(replaceName);
		
		// 문자열 쪼개기
		String memberString = "김인규, 유재석, 하하, 황광희, 조세호";
		
		// 특정 문자열로 쪼개기
		String[] names = memberString.split(",");
		
		for(int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
		}
	}
}