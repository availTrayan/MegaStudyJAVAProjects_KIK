package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		// 1. index와 값을 차례로 입력 받아서, 아래 배열에 해당하는 index에 값을 바꾸고 출력하세요.
		/*
		int[] numbers = {3, 5, 2, 10, 39};
		Scanner sc = new Scanner(System.in);

		System.out.print("변경할 index와 값을 입력하세요 : " );
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int index = num1;
		numbers[index] = num2;
		for(int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i] + " ");
	 }
	*/
		
		// 2. 점수 체점
		/*
		char [] scores = {'X', 'O', 'O','X','X','O','O','O','O','X'};
		int point = 0;
		
	   for(int i = 0; i < scores.length; i++) {
		   if(scores[i] == 'O') {
			   point += 10;
		   }
	   }
	   System.out.println("채점 결과는 " + point + "점 입니다.");
		*/
		
	   // 3. 임금 계산
	   int[] works = {3, 5, 5, 3, 5, 3, 5};
	   int salary = 0;
	
	   for(int i = 0; i < works.length; i++) {

		  if(i < 5) {
			  salary += (works[i] * 8500);
		  } else {
			  salary += (works[i] * 9500);
		  }
			
	   }
	   	System.out.println("일주일간 총 임금은 " + salary);
	   	
	   	// 4. 알파벳 순서
	   	
	   	char[] alphabet = new char[26];
	   	
	   	for(int i = 0; i < alphabet.length; i++) {
	   	
	   		alphabet[i] = (char)('A' + i);
	   	}
	   	
		for(int i = 0; i < alphabet.length; i++) {
		   	
			System.out.print(alphabet[i] + " ");	   
		}
	   		System.out.println();
	   		
	   for(int i = 0; i < alphabet.length; i++) {
		   if(alphabet[i] == 'V') {
			   System.out.println("V는 " + (i + 1) + "번째입니다.");
		   }
	   }
	   		
	


	   	// 5. 배열 값 변경
	   	// 배열의 길이가 5인 int 배열을 만든다.
	   	// 수를 무한 루프로 입력받으면서, 입력받은 수가 짝수일때만 배열에 저장한다.
	   	// 배열이 가득차면 입력을 중단하고 저장된 수들을 출력한다.
	   Scanner sc = new Scanner(System.in);
	   
		int[] numbers2 = new int[5];
		int i = 0;
		
		while(true) {
		
			System.out.print("수를 입력하세요 : ");
			int number = sc.nextInt();
			
			if(number % 2 == 0) {
				numbers2[i] = number;
				i++;
			} 
			
			if(i == numbers2.length) {
				break;
			}
		}
	
	}
}   	
