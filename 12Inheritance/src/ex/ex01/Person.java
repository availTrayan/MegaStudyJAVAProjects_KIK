package ex.ex01;

public class Person {
	
	// 이름, 나이, 
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person 생성자");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 정보출력 기능
	public void printInfo() {
		System.out.println(this.name + "입니다.");
		System.out.println("나이는 "  + this.age + "입니다.");
	}

}
