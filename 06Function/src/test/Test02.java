package test;

import java.util.Scanner;

public class Test02 {
	
	// 1. 합구하기
	public static int sumAll(int x) {
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum += i;
			
			if(sum > 100) {
				break;
			}
		}
		return sum;
	}
	
// 3. 소수 판별
	
	public static boolean isPrimeNumber(int x) {
		
		boolean isPrime = true; //리턴을 true로 주면 생략가능
		
		for(int i = 2; i < x; i++) {
			
			if(x % i == 0) {
				isPrime = false;
				break;
			} 
		}
		return isPrime;
	}
	
	public static void main(String[] args) {

		// 메인함수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int number = sc.nextInt();
		
		System.out.println(isPrimeNumber(number));
	}

}
