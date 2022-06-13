package test;

import java.util.Scanner;

public class Test055 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요 : ");
		int num = sc.nextInt();
	
		boolean isPrime = true;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("소수가 아닙니다.");
				isPrime = false;
				break;
			} 
		}
		if(isPrime) {
			System.out.println("소수 입니다.");
		}
		
	}

}
