package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {

		List<Person> mans = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
	
		while(true) {
		
			System.out.println("1: 입력 2: 출력 3: 삭제 4: 종료");
			int work = scan.nextInt();
			
			if(work == 1) {
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				System.out.println("생년 월일을 입력하세요 : ");
				int birth = scan.nextInt();
			
				mans.add(new Person(name, birth));
				
			}
			
			if(work == 2) {
				if(mans.size() > 0) {
					System.out.println(mans);
				} else {
					System.out.println("비어 있습니다.");
				}
			}
			
			if(work == 3) {
				System.out.print("삭제할 이름을 입력하세요 : ");
				String name = scan.next();
				
				Iterator<Person> iter = mans.iterator();
				
				while(iter.hasNext()) {
					Person remove = iter.next();
					if(name.equals(remove.getName())) {
						iter.remove();
						System.out.println();
					}
				}
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

