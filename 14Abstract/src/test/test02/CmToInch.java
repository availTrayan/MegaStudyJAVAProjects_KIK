package test.test02;

public abstract class CmToInch {
	
	private double cm;

	public CmToInch(double cm) {
		this.setCm(cm);
	}

	public abstract double convertLength();

	public double getCm() {
		return cm;
	}

	public void setCm(double cm) {
		this.cm = cm;
	}
	

}
