package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		// 1. 음수 양수 판별
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력 하세요 : ");
		int num = scan.nextInt();
		
		if (num >0) {
		System.out.println("양수 입니다.");

	} else {
		System.out.println("음수 입니다.");
	}
		 */
		
		// 2. 학점 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력 하세요 : ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80 && score <90) {
			System.out.println("B");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 60 && score < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}
}