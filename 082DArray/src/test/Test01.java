package test;

public class Test01 {

	public static void main(String[] args) {

		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		// 1. 학생 별 평균 구하기
		/*
		for(int i = 0; i < scores.length; i++) {

			int sum = 0;
			double average = 0;
			
			for(int j = 0; j < scores[i].length; j++) {
				 sum += scores[i][j];
				 average = sum / 10.0;
			}
			
			System.out.println((i + 1) + "번째 학생의 평균 : " + average);
		}
		*/
		
		/*
		// 2. 학생 별 최고점 구하기
		for(int i = 0; i < scores.length; i++) {

			int max = 0;
			
			for(int j = 0; j < scores[i].length; j++) {
				 
				if(scores[i][j] > max)
				max = scores[i][j];
				
			}
			
			System.out.println((i + 1) + "번째 학생의 최고점 : " + max);
		}
		*/
		
		
		// 3. 평균 최고점 구하기
		/*
		double maxAverage = 0;
		int stIndex = 0;
		double average = 0;
		
		for(int i = 0; i < scores.length; i++) {
			
			int sum = 0;
			
			for(int j = 0; j < scores[i].length; j++) {
				 sum += scores[i][j];
				 average = sum / 10.0;
						
			if(average > maxAverage) {
				maxAverage = average;
				stIndex = i + 1;
			}
		}

		}
		System.out.println("평균이 가장 높은 학생 : " + stIndex + "번째 학생");
		System.out.println("평균 : " + maxAverage);
		*/
		
		
		// 4. 특정 과목 최고점
		int max = scores[0][4];
		int stIndex = 0;
		
		for(int i = 0; i < scores.length; i++) {

			// 이미 조건범위가 정해져있기 때문에 내부 반복문은 필요없음
				if(scores[i][4] > max) {
					max = scores[i][4];
					stIndex = i + 1;
				}	
		}
		System.out.println("4번째 과목의 최고 성적자는 : " + stIndex+ "번째 학생");
		System.out.println("점수 : " + max);
		}
	
	
	
	// 5. 일부 평균 최고점
	/*
	double average = 0;
	double maxAverage = 0;
	int stIndex = 0;
	
	for(int i = 0; i < scores.length; i++) {
		
		int sum = 0;
		
		for(int j = 3; j < 8; j++) {
			sum += scores[i][j];
			average = sum / 5.0;
		}
		
		if(average > maxAverage) {
			maxAverage = average;
			stIndex = i;
		}
	  }
	System.out.println("평균이 가장 높은 학생 : " + stIndex + "번 index");
	System.out.println("평균 : " + maxAverage);
	}
	*/
}

