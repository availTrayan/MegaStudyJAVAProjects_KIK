package test;

import java.util.Scanner;

public class Test01 {
	
	// 1. 2의 제곱 함수
	
	public static int getSquared(int x) {
		
		int result = x * x;
		return result;
	}
	
	// 2. 평균 구하기 함수
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double result = (score1 + score2 + score3 + score4) / 4;
		return result;
	}
	
	// 3. 몫과 나머지 출력 함수
	public static void printQuotientRemainder(int number1, int number2) {
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("몫 : " + quotient);
		System.out.println("나머지 : " + remainder);
	}
	
	// 4. 홀짝 함수
	public static int oddevenCaculator(int x) {
		if(x % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println(num + "의 제곱은 " + getSquared(5) + "이다.");
		
		System.out.print("점수를 입력하세요 : ");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		int score4 = sc.nextInt();
		System.out.println("평균은 " + getAverage(score1, score2, score3, score4));
		
		System.out.print("숫자를 나눌 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		printQuotientRemainder(num1, num2);
		
		System.out.print("숫자를 입력하세요 : ");
		int number = sc.nextInt();
		System.out.println(oddevenCaculator(number));
	}
	
	

}
