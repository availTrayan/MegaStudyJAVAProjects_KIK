package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		// 실수 (소수)
		double pi = 3.14;
		
		// 문자
		char quiz = 'o';
		
		// 출력
		System.out.println("원주율 : " + pi);
		System.out.println("1번 정답 : " + quiz);
		
		
		// 형변환
		int intpi = (int)pi;
		System.out.println("int pi : " + intpi);
		
		double doublepi = intpi;
		System.out.println("double pi : " + doublepi);
		
		// 평균 구하기
		int score1 = 95, score2 = 100;
		
		// double average = (score1 + score2)/2;
		double average = (score1 + score2)/2.0;
		System.out.println("평균 : " + average);
		
		
	}
}
