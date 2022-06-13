package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 몸무게가 70kg 이하일 때 치킨 먹자
		// 만약 몸무게가 70kg 이하면 치킨 먹자
		
		Scanner scan = new Scanner(System.in);

		int weight = 0;
		System.out.print("체중을 입력하세요 : ");
		weight = scan.nextInt();
		
		if (weight <= 70) {
			System.out.println("치킨 먹자!");
		}
		
		
		// 몸무게가 90 초과 일때 다이어트 시작!
		
		if (weight > 90) {
			System.out.println("다이어트 시작!");
		}
				
		// 몸무게가 67일때 적당해!!
		
		if (weight == 67 ) {
			System.out.println("적당해!!");
		}
		
		// 몸무게가 75가 아닐때 ????
		
		if (weight != 75) {
			System.out.println("????");
		}
		
		boolean condition = true;
		if (condition) {
			System.out.println("무조건 수행!");
		}
		
		condition = weight <= 70;
		// if(weight <= 70) {
			if (condition) {
				System.out.println("치킨 먹자");
		}
			
		//부정
			
			if (! condition) {
				System.out.println("치킨 먹자");
			}
			
		// 변수끼리 비교
			
			int num1 = 10, num2 = -5;
			
			if (num1 < num2) {
				System.out.println("num1이 더 작다!");
			}
	}

}
