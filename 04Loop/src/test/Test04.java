package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		// 1. 합 구하기
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("수를 입력하세요 : "); int num = sc.nextInt();
		 * 
		 * int sum = 0;
		 * 
		 * for(int i = 0; i <= num; i++) { sum += i; } System.out.println("합 : " + sum);
		 */
		
		// 2. 합과 평균 구하기
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int sum = 0; double average = 0;
		 * 
		 * for(int i = 1; i <= 5; i++) { System.out.println(i + "번째 수를 입력 하세요. : "); int
		 * num = sc.nextInt(); sum += num; average = sum / i; }
		 * 
		 * System.out.println("총합 : " + sum + " 평균 : " + average);
		 */
		
		// 3. 팩토리얼
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력 하세요 : ");
		int num = sc.nextInt();
		int factorial = 1;
		int i = 2;
		while(i <= num) {
			
			if(num > 10){
				break;
			}
			factorial *= i;
			i++;
		}
		System.out.println(num + "!" + " = " + factorial);
		*/
		
		// 4. 최소값
		/*
		Scanner sc = new Scanner(System.in);
		
		int min = 1000;
		// min의 조건이 지정되지 않았을 경우 첫번재값을 min으로 세팅하면됨
		for(int i = 1; i <= 5; i++) { 
			
			System.out.print(i + "번째 수를 입력 하세요 : "); 
			int num = sc.nextInt(); 
			
			if(num > 1000) {
				break;
			}
			
			if(num < min) {
				min = num;
			}
		}
		System.out.println("최소값은 " + min + "입니다.");
		*/
		
		// 5. 약수 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	
		}
	}
