package test.test02;

public class Rectangle extends Shape {


	public Rectangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public void calculSize() {
		System.out.println("사각형의 넓이는 " + (getWidth() * getHeight()) + "cm^2 입니다." );
	}

}
