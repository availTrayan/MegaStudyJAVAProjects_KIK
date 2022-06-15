package ex.ex04;

public class Member {
	
	// 이름, 전화번호
	
	private String name;
	private String phoneNum;
	
	public Member(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	@Override
	public String toString() {
		return "이름: " + this.name + " 전화번호: " + this.phoneNum + "\n";
	}
	
}
