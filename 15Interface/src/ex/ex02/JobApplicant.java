package ex.ex02;

public class JobApplicant implements JavaProgramming {
	
	// 이름, 나이, 토익점수
	private String name;
	private int age;
	private int toeic;

	// 자기소개 기능
	public void introduce() {
		System.out.println("저는 취준생이에요!!");
	}
	
	@Override
	public void programming() {
		System.out.println("어필");
	}
	
}
