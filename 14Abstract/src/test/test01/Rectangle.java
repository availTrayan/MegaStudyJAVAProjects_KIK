package test.test01;

public class Rectangle extends Shape {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super("»ç°¢Çü");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculArea() {
		return this.width * this.height;
	}
	
	@Override
	public double calculGirth() {
		return (this.width * 2) + (this.height * 2);
	}
	
	
}
