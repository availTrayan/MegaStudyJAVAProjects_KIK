package ex.ex01;

public class Person {
	
	private String name;
	private int age;
	
	// 생성자
	public Person(String name, int age) {
		System.out.println("Person 생성");
		this.name = name; // private 멤버 변수에 파라미터 저장
		this.age = age;
	}
	
	public String getName() {
		
		return name;
		// return this.name 파라미터에 name이 없으면 생략도 가능
	}
	// getter로 나이 가져오기
	public int getAge() {
		return age;
	}
	
	// setter로 나이 저장
	public void setAge(int age) {
		this.age = age;
	} // source 메뉴의 generate getter and setter로 생성가능
	
	// 객체 정보 출력 기능
	public void printInfo() { // 목적이 명확하다면 getter없이도
		System.out.println("이름 : " + this.name + " " + "나이 : " + this.age);
	}
	
}
