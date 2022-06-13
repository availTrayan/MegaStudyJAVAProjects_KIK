package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		
		// 1. List 만들기
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(20);
		integerList.add(3);
		integerList.add(5);
		integerList.add(84);
		integerList.add(17);
		
		// 2. 최소값 구하기
		int min = integerList.get(0);
		
		for(int i = 0; i < integerList.size(); i++) {
			
			if(min > integerList.get(i)) {
				min = integerList.get(i);
			}
		}
		System.out.println(min);
		
		// 3. 합계 구하기
		
		int sum = 0;
		Iterator<Integer> iter = integerList.iterator();
		
		while(iter.hasNext()) {
			Integer num = iter.next();
			sum += num;
		}
		System.out.println(sum);
		
		// 4. 리스트 삭제
		// 위 문제에서 iterator가 리스트 끝으로간 상태라 초기화 해줘야 동작
		iter = integerList.iterator();
		while(iter.hasNext()) {
			Integer num2 = iter.next();
			if(num2 % 2 == 0) {
				iter.remove();
			}
		}
		System.out.println(integerList);
	}

}
