package ex;

public class Ex01 {

	public static void main(String[] args) {

		// 배열 초기화
		int[] scores = {85, 90, 95, 88, 93, 94};
		
		int[] numbers = new int[5];
		
		// 배열 접근하기
		System.out.println("첫번째 값 : " + scores[0]);
		System.out.println("네번째 값 : " + scores[3]);
		
		// 배열 값 변경
		scores[0] = 90;
		System.out.println(scores[0]);
		
		int index = 4;
		System.out.println(scores[index]);
		scores[index] = 100;
		
		// 조심!
		System.out.println(scores[5]);
		
		// 반복문 제어
		for(int i = 0; i < 6; i++) {
			System.out.println(scores[i]);
		}
		
		// 배열 안의 값 모두 더하기
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
	}

}
