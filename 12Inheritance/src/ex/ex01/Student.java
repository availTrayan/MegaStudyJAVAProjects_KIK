package ex.ex01;

public class Student extends Person {
	
	private String school;
	
	public Student(String name, int age, String school) {
		
		super(name, age); // 부모클래스 생성자 호출로 인자전달
		System.out.println("Student 생성자"); // 부모생성자 먼저 호출후 자식생성자 호출
		this.school = school;
	}
	
	// 메소드 Override
	// Overloading vs Override
	
	@Override
	public void printInfo() {
		super.printInfo(); //부모 클래스 메소드 호출
		/*
		 * System.out.println(this.name + "입니다!"); 
		 * System.out.println("나이는 " + this.age + "입니다!");
		 */
		System.out.println(this.school + "에 다닙니다.");
	}

}
