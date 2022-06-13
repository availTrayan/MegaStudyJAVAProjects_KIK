package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 1. 문자열 출력
		/*
		String text1 = "Oh ";
		String text2 = "My ";
		String text3 = "God";
				
		System.out.println(text1 + text2 + text3);
		*/
		
		// 2. 문자열 입력
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력하세요 : ");
		
		String text = sc.next();
		System.out.println("Welcome! " + text);
		*/
		
		// 3. 문자열 배열
		Scanner scan = new Scanner(System.in);
	
		String[] sentence = new String[3];
		
		for(int i = 0; i < sentence.length; i++) {
			sentence[i] = scan.next();
		}
		
		for(int i = 0; i < sentence.length; i++) {
			System.out.println(sentence[i]);
		}
	}

}
