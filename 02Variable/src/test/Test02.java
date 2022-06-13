package test;

public class Test02 {

	public static void main(String[] args) {
		
		// 1.변수출력
		/*
		변수를 재정의해서 재정의전 출력문을 넣으면 출력결과는 같음
		*/
		
		int score1 = 90, score2 = 80;
		char grade1 = 'A', grade2 = 'B';
		double rate1 = 4.0, rate2 = 3.0;
		
		System.out.println("시험 성적이 " + score1 + "점 이상이면 \'" + grade1 + "\'학점이고 평점은 " + rate1 +"입니다.");
		System.out.println("시험 성적이 " + score2 + "점 이상이면 \'" + grade2 + "\'학점이고 평점은 " + rate2 +"입니다.");
		
		
		// 2.실수 연산
		int number1 = 33;
		double number2 = 35.325;
		double mul = number1 * number2;
		System.out.println("두 수의 곱 : " + mul);
		
		// 3.날짜 구하기

		int day = 24;
		int answer = 943/day;
		System.out.println("943간은 "+answer+"일 입니다.");	
		
		// 4. 도형 넓이 구하기
		int width = 8, length = 9;
		int square = width * length;
		double triangle = (width * length) /2;
		System.out.println("사각형의 넓이 : " + square + "\n삼각형의 넓이 : " + triangle);
		
	
	
		// 5. 평균 구하기
		int korean = 93, math = 88, english = 94;
		int sum = korean + math + english;
		double average2 = (double)sum/3;
		System.out.println("국어 " + korean + "점, " + "수학 " + math +"점, " +"영어 "+english +"점" + "\n평균: " + average2);
		
		// 6. 화씨 구하기
		int Celsius = 30;
		double Fahrenheit = (double) 9/5 * Celsius + 32;
		
		System.out.println("섭씨 " + Celsius + "도는 "+"화씨 " + Fahrenheit + "도 입니다." );
	}

}
