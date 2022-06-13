package test.test02;

public class FountainPen extends Ballpen {
	
     public FountainPen(int amount, String color) {
		super(amount, color);
		
	}
     
	public void refill (int n) { 
         setAmount(n); 
     }

}
