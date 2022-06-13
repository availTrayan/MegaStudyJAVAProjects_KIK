package ex;

public class Ex02 {

	// 육개장 개수에 따른 가격 계산 함수
	public static int getNoodlePrice(int count) {
		
		int result = 900 * count;
		return result;
		
	}
	
	// 육개장 가격과 개수를 전달받아 가격을 계산하는 함수
	// 같은 함수이름으로 파라미터 개수와 타입이 다른 함수를 만든다 (오버로딩)
	public static int getNoodlePrice(int price, int count) {
		return price * count;
	}
	
	// 두 수를 더하는 함수
	public static int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 전달 받을 값이 없고 리턴할 것도 없는 함수
	// Hello World를 두번 출력
	
	public static void printHelloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
	
	 // 1부터 10까지의 합 구하는 함수
	public static int sumAll() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int result = getNoodlePrice(5);
		System.out.println("육개장 가격 : " + result + "원");
		
		int num1 = 10; 
		int num2 = 20;
		
		System.out.println(sum(5, 4 - 1));
		System.out.println(sum(num1, num2));
		System.out.println(getNoodlePrice(900, 4));
		printHelloWorld();
		System.out.println(sumAll());
		
	}

}
