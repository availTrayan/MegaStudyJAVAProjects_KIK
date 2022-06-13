package test.test022;

public class Shape {
	// 도형이름
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	// 넓이를 계산하는 기능
	
	public double calculateArea() {
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 넓이 출력 메소드
	public void printArea() {
		System.out.println(this.name + "의 넓이는 " + this.calculateArea());
	}

}
