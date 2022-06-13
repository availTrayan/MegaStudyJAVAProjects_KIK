package ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 횟수 반복
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello World!!");
		}

		// 1~10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
			// 같은 변수명으로도 같은 중괄호 안에서만 중복된다.
		}
		System.out.println();
		
		// 3. 카운트 다운
		// 10 ~ 0 까지 출력
		for(int i =10; i >= 0; i--) {
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		// 변수를 통한 반복 횟수 제어
		System.out.println("반복 횟수를 입력하세요 : ");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.println("Hello");
		}
		// 몸무게를 입력받고 70이상일 동안 운동을 한다.
		System.out.println("몸무게를 입력하세요 : ");
		int weight = sc.nextInt();
		// for문에 들어갈 내용이 없으면 ;만 있으면 됨
		for(; weight > 70; weight -= 2) {
			System.out.println("으쌰 으쌰!");
		}
		
		// 합 구하기 1 ~ 10
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// for 무한루프, 잘 쓰이지는 않음
		// for(;;) {
		//	
		// }
		
		// break
		int i = 0;
		while(true) {
			if(i == 5) {
				break;
			}
			System.out.println("Hello");
			i++;
		
		}
		
		// continue;
		for(i = 0; i <= 10; i++) {
			if(i % 4 == 0) {
			continue;
			}
			System.out.println(i + " ");
		 }
		 System.out.println();
		
	}

}
