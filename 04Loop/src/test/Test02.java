package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		// 1. 반복 출력
		/*
		for(int i= 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		*/
		
		// 2. 반복 출력

		for (int i = 5; i <= -5; i--) {
			System.out.print(i + " ");
		}
		
		// 3. 특정 조건 구하기
		/*
		for (int i = 1; i <=50; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		*/
		
		// 4. 갯수 세기
		/*
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 7 == 0) {
				 count++;
			}
		}
		System.out.println("7의 배수의 갯수는 : " + count);
		*/
		
		// 5. 구구단
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
		}
		*/
		
		// 6. 가장 큰 수
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.print("수를 입력하세요 : ");
				int num = sc.nextInt();
			
			if(num > max) {
				max = num;
			}
		}
		System.out.println("가장 큰 수 : " + max);
	}
}
