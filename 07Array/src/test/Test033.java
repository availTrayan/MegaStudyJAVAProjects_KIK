package test;

import java.util.Random;
import java.util.Scanner;

public class Test033 {

	public static void main(String[] args) {

		 int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		 int[] frequency = new int[5];
			
			for(int i = 0; i < numbers3.length; i++) {
				int number = numbers3[i] - 1;
				frequency[number]++;
			}
			
			for(int i = 0; i < frequency.length; i++) {
				System.out.println(i + 1 + " : " + frequency[i]);
			}
		
	}

}
