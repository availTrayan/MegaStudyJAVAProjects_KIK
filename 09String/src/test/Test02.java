package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		// 1. 정수 문자열 변환
		
		int year = 2000;
		int month = 11;
		int day = 15;
		
		String yearString = String.valueOf(year);
		String monthString = String.valueOf(month);
		String dayString = String.valueOf(day);
		
		System.out.println(yearString + monthString + dayString);
		
		// 2. 문자열 정수 변환
		
		String yearString2 = "1995";
		
		int age = 2022 - Integer.parseInt(yearString2);
		
		System.out.println("1995년 생의 나이는 " + (age + 1) + "살");
		
		
		// 3. 개수 세기
		
		String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("제품명 : ");
		String good = sc.next();
		
		int count = 0;
		
		for(int i = 0; i < goods.length; i++) {
			if(good.equals(goods[i])){
				count++;
			}
		}
		System.out.println(count + "개");
	}

}
