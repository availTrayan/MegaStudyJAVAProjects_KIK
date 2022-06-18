package test.test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		StopWatch watch = new StopWatch();
		
		System.out.println("시작을 쓰면 스톱워치가 수행되고, 그만을 쓰면 스톱워치가 중단됩니다.");
		
		String command = scan.next();
		
		watch.work(command);
		
		command = scan.next();
		
		watch.work(command);
	
	}

	}

