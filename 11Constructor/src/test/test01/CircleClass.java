package test.test01;

public class CircleClass {
	
	private int diameter;
	

	public CircleClass(int diameter) {
		this.diameter = diameter;
	}


	public double area(int diameter) {
		double area = ((diameter * diameter) * 3.14);
		return area;
	}
	
	public double girth(int diameter) {
		double girth = (diameter * 2) * 3.14;
		return girth;
	}
	
	public double sumArea(int x) {
		double sumarea =  ((diameter * diameter) * 3.14) * x;
		return sumarea;
	}

}
