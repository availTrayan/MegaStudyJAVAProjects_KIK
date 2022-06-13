package ex;

public class Ex01 {

	public static void main(String[] args) {

		// primitive 타입
		int number = 10;
		System.out.println(number);
		
		// Wrapper class
		Integer number2 = 10;
		System.out.println(number2);
		
		Integer number21 = 10;
		
		Integer number3 = new Integer(10); // java9부터 deprecated 됨
		System.out.println(number3);
		
		if(number2 == number21) {
			System.out.println("출력 11"); //wrapper class로 만든값이 같다면 주소도 같다.
		}
		
		if(number2 == number3) {
			System.out.println("출력 22"); //wrapper class의 메모리풀과 heap에 저장된 차이로 주소가 다르다
		}
		
		if(number2.equals(number3)) {
			System.out.println("출력 33");
		}
		
		if(number == number2) {
			System.out.println("출력 44"); // primitive 자료형과의 비교는 하나만있어도 등호연산 가능
		}
		
		if(number == number3) {
			System.out.println("출력 55");
		}
		
	}

}
