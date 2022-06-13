package test;

import java.util.Scanner;

public class Test022 {
	
	
	public static boolean isPrimeNum(int num) {
		
	
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
				
			}
		}
		System.out.println("소수입니다.");
		return true;
		
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println(isPrimeNum(num));
		
	}

}
