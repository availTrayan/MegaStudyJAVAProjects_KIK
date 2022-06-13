package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
	
		int weight = 76;
		
		// 몸무게가 70이하가 될때까지 운동을한다.
		// 몸무게가 70 초과일 동안 운동한다!
		
		while(weight > 70) {
			System.out.println("으쌰으쌰");
			weight = weight -= 2; // weight = weight - 2;
		}
		
		// 횟수 반복 : 5번 Hello World 출력
		int i = 0;
		// i가 5보다 작을 동안 반복
		while(i <5) {
			System.out.println("Hello World!");
			i++;
		}
		
		// 횟수 반복 : 5 ~ 1
		i=5;
		while(i>0) {
			System.out.println(i);
			i--;
		}
		
		// 변수를 통한 횟수제어
		Scanner sc = new Scanner(System.in);
		System.out.print("횟수입력 : ");
		int count = sc.nextInt();
		i =0;
		while(i<count) {
			System.out.println("안녕!");
			i++;
		}
		
		// 누적 연산
		// 1에서 10까지 합구하기
		i=1;
		int sum = 0;
		while(i <= 10) {
			// 1 2 3 4 5 6 7 8 9 10
			sum += i; // sum = sum + i;
			i++ ;
		}
		// 합의 출력은 반복문 끝난 밖에서
		System.out.println("합 : " + sum);
		
		i = 0;
		while(i<5) {
			System.out.println("와와");
			i++;
		}
		
	}

}
