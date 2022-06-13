package test.test01;

public abstract class Shape {
	
	private String name;
	
	public Shape (String name) {
		this.name = name;
	}

	public abstract double calculArea();
	
	public abstract double calculGirth();
	
	public String toString() {
		return this.name + "¿« ≥–¿Ã " + this.calculArea() + " µ—∑π " + this.calculGirth();
		
	}
	
}
