package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		// 1. 반복 출력
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("횟수를 입력하세요 : ");
		
		int i = 0;
		int num = sc.nextInt();
		while(i < num) {
			System.out.println("응 아니야");
			i++;
		}
		*/
		
		// 2. 카운트 다운 발사
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("카운트 다운 입력하세요 : ");
		
		int count = sc.nextInt();
		int i = count;
		
		while(i >= 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("발사");
		*/
		
		// 3. 짝수 합 구하기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		
		int i = 1;
		int sum = 0;
		int num = sc.nextInt();
		
		while(num >= i) {
			if (num % 2 == 0) {
				
			sum += num;
			
		}
			num--;
		}
			System.out.println("더한 결과 : " + sum);
		*/
		
		// 4. 반복 입력
		/*
		Scanner sc = new Scanner(System.in);
		int i = 0;

		while(i<5) {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			System.out.println("출력 : " + num);
			i++;
		}
		*/
		
		// 5. 구구단
		// 굳이 dan 변수를 만들 필요가 없었음
		int dan = 2;
		int i = 1;
		while(i < 10) {
		System.out.println(dan + " x " + i + " = " + dan * i);
			i++;
		}
		
	}
}
