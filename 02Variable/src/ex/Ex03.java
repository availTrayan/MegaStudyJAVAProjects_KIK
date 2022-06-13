package ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// 입력받기 위한 연산자
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("육개장 가격을 입력하세요: ");
		// 콘솔에서 육개장 가격 입력받기
		int noodlecup = scan.nextInt();
		
		System.out.println("육개장 가격 : " + noodlecup + "원");

		// 육개장 5742개 가격출력
		
		int total = noodlecup * 5742;
		System.out.println("육개장 5742개의 가격은 : " + total + "원");
		*/
		
		// 육개장 가격과 개수를 입력받고 계산
		/*
		System.out.print("육개장 가격 입력: ");
		int noodlecup = scan.nextInt();
		System.out.print("육개장 개수 입력: ");
		int count = scan.nextInt();
		*/
		// 두개의 숫자를 순서대로 입력받고 계산
		System.out.print("육개장 가격과 개수를 순서대로 입력하세요 :");
		int noodlecup = scan.nextInt();
		int count = scan.nextInt();
		System.out.println("육개장 계산결과 " + noodlecup * count + "원");
		
		// 소수 입력받기
		double pi = scan.nextDouble();
		System.out.println("파이는 " + pi);
		
		scan.close(); //스트림 연결 끊기
		
	}

}
