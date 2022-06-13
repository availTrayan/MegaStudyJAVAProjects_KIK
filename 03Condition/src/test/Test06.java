package test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		// 1. 과락 포함 합격 여부
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수1 : ");
		int score1 = sc.nextInt();
		
		System.out.print("점수2 : ");
		int score2 = sc.nextInt();
		
		// 합,불은 평균 변수 만들어서 계산해도됨
		// double average = (socre1 + score2) /2.0;
		
		if (score1 <= 50 || score2 <= 50){
			System.out.println("과락");
		} else if ((score1 + score2)/2 >= 60) {
			System.out.println("합격");
		} else if ((score1 + score2)/2 < 60) {
			System.out.println("불합격");
		}
		*/
		
		// 2. 윤년 구하기
		// 4와 100 나누기 조건을 묶고 400 나누기 조건을 묶어야하는 순서가 잘 이해안됩니다.
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도 : ");
		int year = sc.nextInt();
		
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		*/
		
		
		// 3. 가위 바위 보 게임
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영희 공격 : ");
		int attack1 = sc.nextInt();
		System.out.print("철수 공격 : ");
		int attack2 = sc.nextInt();
		
		if ((attack1 == 1 && attack2 == 2 ) || (attack1 == 3 && attack2 == 1) || (attack1 == 2 && attack2 == 3)) {
			System.out.println("철수가 이겼다.");
		} else if ((attack1 == 2 && attack2 == 1) || (attack1 == 3 && attack2 == 2) || (attack1 == 1 && attack2 == 3)){
			System.out.println("영희가 이겼다.");
		} else {
			System.out.println("비겼다!");
		}
		*/
		
		// 4. 45분전
		// 조건문 사용조건을 찾지 못했습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 분 입력 : ");
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		minute -= 45;
		
		if(minute < 0) {
			hour--;
			//-15
			minute = 60 + minute;
			
			if(hour < 0) {
				hour += 24;
			}
		}
		
		System.out.println(hour + "시 " + minute + "분");
		}
		
	
		// 5. 윷놀이
		/*
	Scanner sc = new Scanner(System.in);
	System.out.print("윷 상태를 입력하세요 : ");
	int yut1 = sc.nextInt();
	int yut2 = sc.nextInt();
	int yut3 = sc.nextInt();
	int yut4 = sc.nextInt();
	
	int sum = 0;
	sum = yut1 + yut2 + yut3 + yut4;
	
	switch (sum) {
	
	case 1 :
		System.out.println("도");
		break;
	case 2 :
		System.out.println("개");
		break;
	case 3 :
		System.out.println("걸");
		break;
	case 4 :
		System.out.println("윷");
		break;
	default :
		System.out.println("모");
	}
	*/
}
