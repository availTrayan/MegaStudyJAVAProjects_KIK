package test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		// 1. 짝수 구하기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("세개의 수를 입력 하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1%2 == 0) {
			System.out.println(num1 + "은 짝수 입니다.");
		} 
		if (num2%2 ==0) {
			System.out.println(num2 + "은 짝수 입니다.");
		} 
		if (num3%2 == 0) {
			System.out.println(num3 + "은 짝수입니다.");
		}
		 */
		
		// 2. 비만도 구하기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print ("bmi 수치를 입력하세요 : ");
		int bmi = sc.nextInt();
		if (bmi >20 ) {
			System.out.println("비만");
		} else if (bmi <= 20 && bmi >10) {
			System.out.println("과체중");
		} else {
			System.out.println("정상");
		}
		*/
		
		// 3. 평균 합격 구하기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("두 점수를 입력 하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if ((num1 + num2)/2 >= 70) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다.");
		}
		*/
		
		// 4. 큰값 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("세 수를 입력 하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		/*
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
		} else if (num3 > num1 && num3 > num2){
			System.out.println(num3);
		}
		*/
		
		// 변수 갯수만큼 if문만 늘려주면 되는 효율적 코드
		// 비교는 첫번째 입력부터 시작하니까
				int max = num1; 
				if (max < num1) {
					max = num1;
				}
				if (max < num2) {
					max = num2;
				}
				if (max < num3) {
					max = num3;
				}
		
		// 5. 계절 구하기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 3 : 
		case 4 :
		case 5 :
			System.out.println("봄");
			break;
		case 6 : 
		case 7 :
		case 8 :
			System.out.println("여름");
			break;
		case 9 : 
		case 10 :
		case 11 :
			System.out.println("가을");
			break;	
		case 1 : 
		case 2 :
		case 12 :
			System.out.println("겨울");
			break;
		}
		*/
	}
}
