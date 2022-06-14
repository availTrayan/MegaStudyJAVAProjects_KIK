package test.test02;

public class Circle extends Shape {

	private double diameter;
	
	public Circle(double diameter) {
		super();
		this.diameter = diameter;
	}
	
	@Override
	public void calculSize() {
		
		System.out.println("원의 넓이는 " + (diameter * diameter * 3.14) + "cm^2 입니다." );

	}
}
