package ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(3);
		numbers.add(8);
		numbers.add(1);
		numbers.add(4);
		numbers.add(6);
		
		// 포함 여부 확인
		// 6이 포함되어 있는지 확인
		
		if(numbers.contains(6)) { // 반복문 대신 contains 메소드로 boolean 반환
			System.out.println("6이 포함됨");
		}
		
		// 정렬
		// 버블정렬, 선택정렬, 삽입정렬 은 코드상으로는 느린방법
		// 퀵 정렬, 병합정렬 속도가 빠른 방법
		
		// 오름차순 1 2 3 4
		numbers.sort(Comparator.naturalOrder()); // 리스트의 정렬 메소드
		System.out.println(numbers); // 정렬된 리스트 출력
		
		// 내림차순 4 3 2 1
		numbers.sort(Comparator.reverseOrder());
		System.out.println(numbers);
		
		numbers.clear();
		
		// 비어있는지 확인
		if(numbers.isEmpty()) {
			System.out.println("리스트가 비어 있다.");
		}
	}

}
