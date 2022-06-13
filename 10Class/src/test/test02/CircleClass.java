package test.test02;

public class CircleClass {
	
	public int diameter;
	
	double area(int diameter) {
		double area = ((diameter * diameter) * 3.14);
		return area;
	}
	
	double girth(int diameter) {
		double girth = (diameter * 2) * 3.14;
		return girth;
	}
	
	double sumArea(double circleArea , int x) {
		double sumarea =  circleArea * x;
		return sumarea;
	}
		
  }


