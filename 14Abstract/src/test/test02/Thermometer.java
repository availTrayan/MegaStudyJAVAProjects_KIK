package test.test02;

public class Thermometer extends CelciusToFahrenheit {
	
	private double celcius;

	public Thermometer(double celcius) {
		this.celcius = celcius;
	}

	@Override
	public double convertTemperature() {
		return (9 / 5 * this.celcius) + 32;
	}
	
	public String printResult() {
		return "¼·¾¾ : " + this.celcius + " È­¾¾ : " + this.convertTemperature();
	}

}
