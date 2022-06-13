package test.test03;

public class JudgeWeight extends HealthInfo {
	
	private double normalWeight;
	
	public JudgeWeight(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	public double calculSW() {
		
		this.normalWeight = (this.height - 100) * 0.9;
		return normalWeight;	
	}
	
	public void calculBMI() {
		
		double bmi = ((this.weight - calculSW()) / normalWeight * 100);
		
		if(bmi >= 20) {
			System.out.print(" => 비만 입니다.");
		} else if(bmi >= 10 && bmi < 20) {
			System.out.print(" => 과체중 입니다.");
		} else {
			System.out.print(" => 정상입니다.");
		}
		
	}
	
	 public void showInfo() {
	        System.out.print(name + "님의 신장 " + height + ", 몸무게 " + weight + "kg");
	        calculBMI();
	    }
	
}
