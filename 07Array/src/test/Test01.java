package test;

public class Test01 {

	public static void main(String[] args) {

		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		// 1. 배열의 4번째 값을 6으로 변경
		numbers[3] = 6;
		
		// 2.배열에 값을 순서대로 출력하세요. 
		/*
		for(int i = 0; i < numbers.length; i ++) {
		System.out.print(numbers[i] + " ");
		}
		*/
		
		// 3. 배열에 값이 반대순서로 출력하세요.
		/*
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		*/
		
		// 4. 배열에 짝수번째 위치에 있는 값들을 출력하세요.
		/*
		for(int i = 2; i < numbers.length; i++) {
			if(i % 2 == 0) {
				System.out.println(numbers[i - 1] + " ");
			}
		}
		*/
		
		// 5. 배열에 값들 중 2가 들어있는 index를 출력하세요.
		/*
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 2) {
			
				System.out.println("2가 들어있는 index : " + i);
			}
		}
		*/
		
		// 6. 배열에 값들 중 가장 큰 값을 출력하세요
		/*
		int max = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		*/
		
		// 7. 배열에 값들 중 가장 작은 수가 저장된 index를 출력하세요.
		
		int min = numbers[0];
		int minIndex = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
				minIndex = i;
			}
		}
		System.out.println("최소값의 index : " + minIndex);
		
		/*
		// 8. 배열에 모든 수의 합을 출력 하세요
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("값의 합 : " + sum);
		*/
	}
	
}
