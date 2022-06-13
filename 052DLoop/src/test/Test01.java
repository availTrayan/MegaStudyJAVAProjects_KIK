package test;

public class Test01 {

	public static void main(String[] args) {
		
		// 1. 주사위 문제
		/*
		for(int i = 1; i <= 6; i++) {
		
			for(int j = 1; j <= 6; j++) {
				System.out.print("(" + i + "," + j + ")" + " ");
			}
			System.out.println();
		}
		*/
		
		// 2. 구구단
		/*
		for(int i = 2; i <= 9; i++) {
		
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
		*/
		
		// 3. 별찍기 1
		/*
		for(int i = 1; i <= 5; i++) {
		
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		 }
		*/
		
		// 4. 별찍기 2
		/*
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 5; j >= i; j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 5. 별찍기 3
		
		/*
		 * for(int i = 0; i < 5; i++) { for(int j = 5 ; j >= 0; j--) {
		 * 
		 * if(i < j) { System.out.print("+");
		 * 
		 * } else { System.out.print("*"); } } System.out.println(); }
		 */
		
		// 별찍기 3 다른 방법
		for(int i = 0; i < 5; i++) {
			//  5 5 5 5 5
			// -1 2 3 4 5
			//  4 3 2 1 0
			for(int j = 0; j < (5 - i); j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 6. 별찍기 4
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 0; j < (5 - i); j++) {
				System.out.print(" ");
			}
				
			// 1 2 3 4 5
			// 1 3 5 7 9  = (2n - 1)
			//
			for(int j = 0; j < ((2 * i) - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
