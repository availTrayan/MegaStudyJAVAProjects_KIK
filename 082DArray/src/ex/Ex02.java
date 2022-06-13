package ex;

public class Ex02 {

	public static void main(String[] args) {

		int[][] numbers = new int[5][3];
		
		// {0, 0, 0} 
		// {0, 0, 0} 
		// {0, 0, 0} 
		// {0, 0, 0} 
		// {0, 0, 0} 

		
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j =0; j < numbers[j].length; j++) {
				
				numbers[i][j] = 5;
				numbers[i][j] = j + 1;
				numbers[i][j] = i + 1;
				
				if(i == 3) {
					numbers[i][j] = 1;
				}
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
