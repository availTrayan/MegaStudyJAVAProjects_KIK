package test.test02;

public class Galaxy {

	private String company;
	private String name;
	private String srNum;
	private String phoneNum;
	
	// 생성자
	public Galaxy(String srNum) {
		this.company = "삼성"; // 정해진 값은 미리 넣어도 됨
		this.name = "Galaxy";
		this.srNum = srNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void showInfo() {
		System.out.println(this.company + "에서 제조된 " + this.name +  "입니다.");
		System.out.println("전화 번호 : " + this.phoneNum);
		System.out.println("일련 번호 : " + this.srNum);		
	}
	
	public void callPhone(String phoneNum) {
		this.phoneNum = phoneNum;
		System.out.println(phoneNum + " 로 전화를 겁니다 뚜르르르르...");
	}

	public void sendMessage(String phoneNum, String message) {
		this.phoneNum = phoneNum;
		System.out.println(phoneNum + " 로 \"" + message +  "\" 메시지를 전송합니다.");
	}
}
