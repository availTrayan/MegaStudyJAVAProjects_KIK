package test.test03;

public class OmrCardReader {
	
	private int[] answers;

	public OmrCardReader() {
		answers = new int[5]; //answer의 값이 변할수있도록 생성자에서 초기화
	}

	public void setAnswers(int answer1, int answer2, int answer3, int answer4, int answer5) {
		this.answers[0] = answer1;
		this.answers[1] = answer2;
		this.answers[2] = answer3;
		this.answers[3] = answer4;
		this.answers[4] = answer5;
	}
	
	public void printInfo() {
		for(int i = 0; i < answers.length; i++) {
			System.out.print(answers[i] + " ");
		}
		System.out.println();
	}

	// 채점 기능, answers 정답과 전달된 omr 카드의 정답을 비교해서 점수 리턴
		public int checkScore(OmrCard card) {
			int score = 0;
			
			int[] marking = card.getMarking();
			
			for(int i = 0; i < marking.length; i++) {
				if(answers[i] == marking[i]) {
					score += 20;
				}
			}
			return score;
		}

	
		public void printResult(OmrCard card) {
			int score = this.checkScore(card);
	
			System.out.println("이름 : " + card.getName());
			System.out.println("학번 : " + card.getStudentId());
			System.out.println("점수 : " + score);
		}

		//여러장 체점 결과 기능
		public void printResult(OmrCard[] card) {
			for(int i = 0; i < card.length; i++) {
				this.printResult(card[i]);
			}
		}

}
