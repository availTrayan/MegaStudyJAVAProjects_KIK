package test.test02;

public class Test02 {

	public static void main(String[] args) {

		FountainPen fp = new FountainPen(12, "Black");
		fp.setAmount(13);
		fp.printInfo();
		SharpPencil sp = new SharpPencil(13, "White", 5);
		sp.printInfo();
		fp.refill(20);
		fp.printInfo();
		
	}

}
