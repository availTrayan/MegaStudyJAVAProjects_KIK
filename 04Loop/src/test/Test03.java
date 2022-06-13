package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		// 1. 무한루프 탈출
		/*
		int i = 0;
		while(true) {
			if(i == 8) {
				break;
			}
			System.out.println("Hello World");
			i++;
		}
		*/
		
		// 2. 짝수 출력
		/*
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		*/
		
		// 3. 배수 출력
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 100; i++) {
			if(i % num == 0) {
				System.out.println(i);
			}
		}
		*/
		
		// 4. 무한 입력
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("수를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
		}
		
	}
		System.out.println("끝");

}
}