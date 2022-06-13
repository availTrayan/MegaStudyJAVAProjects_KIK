package test;

import java.util.Scanner;

public class Test022 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numbers2 = new int[5];
	    
	    int i = 0;
	    
	    while(i != 5) {
	      
	        System.out.print("수를 입력하세요 : ");
	        int number = scan.nextInt();
	        
	        if(number % 2 == 0) {
	            numbers2[i] = number;
	            i++;
	        }
	    }
	    
	    for(i = 0; i < 5; i++) {
	        System.out.print(numbers2[i] + " ");
	    }
	    
	    System.out.println("");
	    
	    scan.close();
	}
	}
