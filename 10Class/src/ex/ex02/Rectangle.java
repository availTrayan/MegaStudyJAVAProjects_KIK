package ex.ex02;

public class Rectangle {
	
	int width;
	int height;
	
	int calculateArea() {
		int area = width * height;
		return area;
	}
	
	int calculateArea(int count) {
		int area = calculateArea() * count;
		return area;
	}
	
	void printInfo() {
		System.out.println("가로 : " + width + " 세로 : " + height);
	}

}
