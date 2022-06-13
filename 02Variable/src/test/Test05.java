package test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		// 1. 자릿수 쪼개기
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력");
		int num = scan.nextInt();
		
		// 1234
		int result = num / 1000;
		System.out.println(result);
		
		// 234
		num = num % 1000;
		result = num /100;
		System.out.println(result);
		
		// 34
		num = num % 100;
		result = num /10;
		System.out.println(result);
		
		result = num % 10;
		System.out.println(result);
		*/
		
		// 2. 자릿수 쪼개기 역순
		// 1234
		/*
		int result = num % 10;
		System.out.println(result);
		
		// 123
		num = num / 10;
		result = num % 10;
		System.out.println(result);
		
		// 12
		num = num / 10;
		result = num % 10;
		System.out.println(result);
		
		result = num / 10;
		System.out.println(result);
		*/
		
		// 3. 자릿수 합 구하기
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("네자리 수를 입력하세요");
		int number = scan.nextInt();
		
		int sum = 0;
		
		while(number != 0) {
			
			sum += number % 10;
			number /= 10;
		}
		System.out.println("합계는 " + sum + "입니다.");
		*/
		
		// 4. 역순 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("세자리 수를 입력하세요");
		int number = scan.nextInt();
		// 123
		System.out.print(number % 10); // 3
		// 123
		number = number / 10; // 12
		System.out.print(number % 10); // 2
		// 12
		number = number / 10; // 1
		System.out.print(number % 10); // 1
		
	}

}
