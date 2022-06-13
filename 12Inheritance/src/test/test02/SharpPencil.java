package test.test02;

public class SharpPencil extends Ballpen {
	
	 
	private int width; // ∆Ê¿« ±Ω±‚
    private int amount; // ≥≤¿∫ ∑Æ
     
    
     public SharpPencil(int amount, String color, int width) {
 		super(amount, color);
 		this.width = width;
 	}

     public void printInfo() {
    	 super.printInfo();
    	 System.out.println(width);
     }
}
