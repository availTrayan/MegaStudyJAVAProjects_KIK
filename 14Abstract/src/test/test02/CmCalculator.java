package test.test02;

public class CmCalculator extends CmToInch{

	public CmCalculator(double cm) {
		super(cm);
		
	}

	@Override
	public double convertLength() {
		return this.getCm() / 2.54;
	}
	
	public void printResult() {
		
	}

}
