package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 두 점수 합격
		
		/*
		System.out.print("두 점수를 입력하세요 : ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 > 70 && num2 >70) {
			System.out.println("합격 입니다.");
		}
		*/
		
		// 2. 공배수 구하기
		/*
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();

		if(number%2 == 0 && number%3 == 0) {
			System.out.println(number + "는 2와 3의 공배수 입니다.");
		}
		*/
		
		// 3. 범위
		System.out.print("1~10 사이의 수를 입력 하세요 : ");
		int number = scan.nextInt();
		
		if(number < 1 || number > 10) {
			System.out.println("잘못 입력 하셨습니다");
		}
		
	}

}
