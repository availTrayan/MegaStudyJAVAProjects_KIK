package ex;

public class Ex01 {

	public static void main(String[] args) {

		// 성적 관리 이차원 배열
		int[][] scores = {
				{95, 90, 100, 95, 94}, 
				{80, 85, 88, 84, 92},
				{40, 55, 64, 45, 50}
			};
		
		System.out.println("두번째 학생의 네번째 점수 : " + scores[1][3]);
		System.out.println("세번째 학생의 두번째 점수 : " + scores[2][1]);
		System.out.println("첫번째 학생의 세번째 점수 : " + scores[0][2]);
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		// 이차원 배열 연산
		// 학생별 총점
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println("학생별 총점 : " + sum);
		} 
		
		
		
	}

}
