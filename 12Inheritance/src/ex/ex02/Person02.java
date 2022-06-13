package ex.ex02;

public class Person02 extends Object{
	
	// 이름 나이
	private String name;
	private int age;
	
	public Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 기존의 출력 메소드 수동작성
	
	 public String printInfo() {
		 return "이름  : " + this.name + " 나이 : " + this.age; }
	 
	
	@Override
	public String toString() {
		return "이름  : " + this.name + " 나이 : " + this.age;
	}
	
	

}
