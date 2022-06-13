package test.test02;

import test.test022.Circle;
import test.test022.Rectangle;
import test.test022.Shape;
import test.test022.Triangle;

public class Test02 {

	public static void main(String[] args) {

		
		Shape[] shape = new Shape[3];

        // upcasting
        shape[0] = new Triangle(8, 10);
        shape[1] = new Rectangle(7, 13);
        shape[2] = new Circle(12);
        
        
        for(int i = 0; i < shape.length; i++) {
        	
        	shape[i].calculSize();
        	
        }
		
		
	}

}
