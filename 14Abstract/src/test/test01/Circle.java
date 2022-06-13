package test.test01;

public class Circle extends Shape {
	
	private double diameter;

	public Circle(double diameter) {
		super("¿ø");
		this.diameter = diameter;
	}
	
	@Override
	public double calculArea() {
		return this.diameter * this.diameter * 3.14;
	}

	@Override
	public double calculGirth() {
		return (this.diameter * 2) * 3.14;
	}

}
