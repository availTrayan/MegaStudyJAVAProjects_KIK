package test.test04;

public class Triangle {
	
	private int width;
	private int height;

	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double calculSize() {
	
	double size = ((this.width * this.height) / 2);
	return size;
	
	}
	
	@Override
	public String toString() {
		return "πÿ∫Ø : " + this.width + " ≥Ù¿Ã : " + this.height + " ≥–¿Ã : " + calculSize();
		
	}
	
	
}
