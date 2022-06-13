package test;

public class Test01 {

	public static void main(String[] args) {
	
		String name = "안희용";
		int age = 30;
	
		System.out.println("이름 : " + name + " 나이 :" + age);
		
		int num1 = 3, num2 = 5;
		int plus = num1 + num2;
		int minus = num1 - num2;
		
		System.out.println(num1 + " + " + num2 + " = " + (plus));
		System.out.println(num1 + " - " + num2 + " = " + (minus));
		
		/*
		 int result = num1 + num2;
		 result = num1 - num2;
		 변수 재정의로 변수를 줄일 수 있음
		 */
		
		
		for (int num4 = 1; num4 <= 5; num4++ ) {
			
			int sum = num2 * num4;
			System.out.println( num2 + " x " + num4 + " = " + sum);
			
			
		}	
	}
}
