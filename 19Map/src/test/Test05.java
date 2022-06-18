package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
			while(true) {
			
			System.out.println("1: 입력 2: 출력 3: 삭제 4: 종료");
			int work = scan.nextInt();
			
				if(work == 1){
					System.out.print("과일 이름을 입력하세요 : ");
					String fruitName = scan.next();
					fruits.add(fruitName);
					
					if(fruits.contains(fruitName)) {	
					System.out.println("입력 성공");
					}
				}	
				
				if(work == 2) {
					if(fruits.size() > 0) {
						System.out.println(fruits);
					} else {
						System.out.println("비어 있습니다.");
					}
				}
			
				if(work == 3) {
					System.out.println("삭제할 과일 이름을 입력하세요 : ");
					String removeName = scan.next();
					fruits.remove(removeName);
					System.out.println("삭제 성공");
				}
			
				if(work == 4) {
					System.out.println("종료합니다.");
					break;
				}
				
				if(work != 1 && work != 2 && work != 3 && work != 4 ) {
					System.out.println("잘못 입력했습니다.");
				}
			}
		}
}
	


