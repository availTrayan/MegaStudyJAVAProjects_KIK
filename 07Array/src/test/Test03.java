package test;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		// 1. 위치 변경
		/*
		int[] numbers = {3, 5, 2, 10, 39};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 index를 입력 하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int temp = numbers[num1];
		numbers[num1] = numbers[num2];
		numbers[num2] = temp;
		
		for(int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i] + " ");
		}
	}
	*/
		
	// 2. 셔플
	/*
	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	Random rand = new Random();

	for (int i = 0; i < 100; i++) {
	    int randomNumber = rand.nextInt(10);
	    // swap 구현
	
	
	// 0 번 index의 값과 임의로 뽑힌 index의 값을 교체한다.
	int temp = numbers[0];
	numbers[0] = numbers[randomNumber];
	numbers[randomNumber] = temp;
	}
	
	for(int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i] + " ");
	}
	*/
		
	// 3. 없는 수 찾기
	
	int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
	
	// 수가 없는지 체크할 배열
	boolean[] checkList = new boolean[9];
	
	for(int i = 0; i < numbers2.length; i++) {
		
		int number = numbers2[i] - 1;
		checkList[number] = true;
	}
	
	for(int i = 0; i < checkList.length; i++) {
		if(checkList[i] == false) {
			System.out.println("없는 수는 " + (i + 1) + "입니다.");
			break;
		}
	}
	
	// 4. 빈도수 구하기
	
	int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
	int[] frequency = new int[5];
	
	for(int i = 0; i < numbers3.length; i++) {
		int number = numbers3[i] - 1;
		frequency[number]++;
	}
	
	for(int i = 0; i < frequency.length; i++) {
		System.out.println(i + 1 + " : " + frequency[i]);
	}

}
}
