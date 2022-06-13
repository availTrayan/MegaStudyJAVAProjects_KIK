package test.test03;

public class OmrCard {
	
	// 이름, 학번, 마킹한 정답
	private String name;
	private String studentId;
	private int[] marking = new int[5];
	
	
	
	// 학번과 이름을 입력받는 생성자
	public OmrCard(String name, String stNum) {
		this.name = name;
		this.studentId = studentId;
//		marking = new int[5];  // 초기화할거면 생성자 안에서 하는게 좋음
	}
	
	
	// 문제의 정답을 입력받는 메소드
	public void setMarking(int[] marking) {
			this.marking = marking;
	}
	
	public void setMarking(int answer1, int answer2, int answer3, int answer4, int answer5) {
		this.marking[0] = answer1;
		this.marking[1] = answer2;
		this.marking[2] = answer3;
		this.marking[3] = answer4;
		this.marking[4] = answer5;
	}
	
	// 순서없이 마킹할수있는 방법의 메소드 오버로딩
	public void setMarking(int number, int answer) {
		this.marking[number - 1] = answer; // 번호에 맞는 인덱스에 정답마킹
	}

	// 출력확인용
	public void printInfo() {
		System.out.println("이름 : " + this.name + " 학점 : " + this.studentId);
		
		for(int i = 0; i < this.marking.length; i++) {
			System.out.print(this.marking[i] + " ");
		}
		System.out.println();
	}
	
	public int[] getMarking() {
		return this.marking;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getStudentId() {
		return this.studentId;
	}

}


