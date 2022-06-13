package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		// 1. 자리수 계산
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("수를 입력하세요 : "); int num
		 * = sc.nextInt();
		 * 
		 * int count = 0; while(num != 0) { num /= 10; count++; }
		 * System.out.println(count);
		 */

		// 2. 윤년 개수
		// 출력이 안됩니다.
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("두개의 년을 입력 하세요 : ");
		 * int year1 = sc.nextInt(); int year2 = sc.nextInt(); int yearCount = 0;
		 * for(int i = year1 + 1; i <= year2; year1++) { if((i % 4 == 0 && i % 100 != 0)
		 * || (i % 400 == 0)) { yearCount++; } } System.out.println(yearCount);
		 */

		// 3. 3 6 9 게임
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("수를 입력하세요 : "); int num
		 * = sc.nextInt(); int clap = 0; for(int i = 1; i <= num; i++) {
		 * 
		 * if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) { clap++; }
		 * 
		 * if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) { clap++; } }
		 * System.out.println(clap);
		 */

		// 4. 주사위 중복 제거
		/*
			for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i <= j) {
					System.out.print("(" + i + "," + j + ")" + " ");
				}
			}
			System.out.println();
			*/
		
			// 5. 달력 출력하기

		 	int day = -2;
		    System.out.println(" 2020 / 7 \n");
		    System.out.println("  S   M   T   W   T   F   S ");
		    
		    for(int i = 0; i < 5; i++) {
		    	
		        for(int j = 0; j < 7; j++) {
		        	
		            if(day > 0) {
		            	
		                if(day < 10) {
		                	
		                    System.out.print("  " + day + " ");
		                    
		                } else {
		                	
		                	System.out.print(" " + day + " ");
		                }
		                
		            } else {
		            	
		            	System.out.print("    ");
		            }
		            
		            day++;
		            
		            if(day > 31) {
		                break;
		            }
		        }
		        System.out.println();
		    }
	}

}
