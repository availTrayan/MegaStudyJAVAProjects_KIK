package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		// 1. 구구단
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 범위를 입력하세요 : ");
		int dan1 = sc.nextInt();
		int dan2 = sc.nextInt();
		int result;
		
		for(int i = dan1; i <= dan2; i++) {
			for(int j = 1; j <= 9; j++) {
				result = i * j;
				System.out.println(i + " x " + j + " = " + result);
			}
		}
		*/
		
		// 2. 별찍기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int line = sc.nextInt();
		
		for(int i = 1; i <= line; i++) {
			
			for(int j = 0; j < (line - i); j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < ((2 * i) - 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		// 3. 모래시계 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("줄 수를 입력하세요 : ");
		int line = scan.nextInt();
		
		
		int half = line / 2;
		
		// 가운데 줄을 포함한 절반 출력
		for(int i = 0; i < half + 1; i++) {
			
			// 앞 `-` 출력 
			for(int j = 0; j < i; j++) {
				System.out.print("-");
			}
			
			// 라인수를 기반으로 홀수 개의 *+* 패턴을 반복
			// i가 진행될수록 찍는 패턴이 줄어드는것을 알겠으나 패턴찍히는 좌표에 대한 이해가 안갑니다.
			for(int j = 0; j < (half - i) * 2 + 1; j++) { 
				if(j % 2 == 0) { // 2로 나누어 떨어지는 경우 * 출력
					System.out.print("*");
				} else {  // 그외의 경우 + 출력 
					System.out.print("+");
				}
			}
			
			// 뒷 `-` 출력
			for(int j = 0; j < i; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		
		// 밑에 나머지 줄 출력 
		for(int i = 0; i < half; i++) {
			
			// 앞 `-` 출력
			for(int j = 0; j < half - i - 1; j++) {
				System.out.print("-");
			}
			
			// 라인수를 기반으로 홀수 개의 *+* 패턴을 반복
			for(int j = 0; j < (i + 1) * 2 + 1; j++) {
				if(j % 2 == 0) {    // 2로 나누어 떨어지는 경우 * 출력
					System.out.print("*"); 
				} else {	// 그외의 경우 + 출력
					System.out.print("+");
				}
			}
			
			// 뒤 `-` 출력
			for(int j = 0; j < half - i - 1; j++) {
				System.out.print("-");
			}
			
			System.out.println();
		}
		
		
		// 4. 숫자 삼각형 출력하기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 삼각형의 크기를 입력하세요: ");
		int line = sc.nextInt();
			
		for(int i = 1; i <= line; i++) {
			int number = i;
			
			for(int j = 0; j < i; j++) {
				System.out.print(number + " ");
				number += (line - 1) - j;
			}
			System.out.println();
		}
		 */
	}
	}


