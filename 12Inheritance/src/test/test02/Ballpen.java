package test.test02;

public class Ballpen {
	
	 private int amount; // 남은 량
     private String color; // 볼펜의 색
     
     
     public Ballpen(int amount, String color) {
		this.amount = amount;
		this.color = color;
	}
     

	public int getAmount() { 
         return amount; 
     }
     public void setAmount (int amount) { 
         this.amount = amount; 
     }
     public String getColor() { 
         return color; 
     }
     public void setColor(String color) { 
         this.color = color; 
     }
     
     public void printInfo() {
    	 System.out.println(amount + " " + color);
     }

}
