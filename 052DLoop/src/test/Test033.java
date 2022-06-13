package test;

public class Test033 {

	public static void main(String[] args) {

		int day = -2;
	    System.out.println(" 2020 / 7 \n");
	    System.out.println("  S   M   T   W   T   F   S ");
	    
	    for(int i = 0; i < 5; i++) {
	    	
	        for(int j = 0; j < 7; j++) {
	        	
	            if(day > 0) {
	            	
	                if(day < 10) { // 이 조건이 없으면 달력이 망가진다는것을 확인했으나 이유를 모르겠습니다.
	                	
	                    System.out.print("  " + day + " ");
	                    
	                } else {
	                	
	                	System.out.print(" " + day + " ");
	                }
	                
	            } else {
	            	
	            	System.out.print("    ");
	            }
	            
	            day++;
	            
	            if(day > 31) {
	                break;
	            }
	        }
	        System.out.println();
		
	}
  }
}
