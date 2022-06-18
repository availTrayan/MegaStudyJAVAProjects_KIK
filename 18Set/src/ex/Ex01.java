package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {

		// 입력 순서 그대로 저장이 됨
		Set<Integer> hash = new HashSet<>();
		
		// 값의 크기대로 저장된다.
		// 입력 3 5 2 7 1
		// 저장 1 2 3 5 7
		// 정렬때문에 속도가 느림
		Set<Integer> tree = new TreeSet<>();
		
		hash.add(5);
		hash.add(7);
		hash.add(3);
		
		System.out.println(hash);
		
		// HashSet은 중복저장 여부를 확인할수 있음
		boolean flag = hash.add(7);
		System.out.println(flag);
		
		hash.remove(7);
		System.out.println(hash);
		
		if(hash.contains(3)) {
			System.out.println("3이 존재함");
		}
		
		// 반복문
		for(Integer number : hash) {
			System.out.print(number + " ");
		}
		
		Iterator<Integer> iter = hash.iterator();
		while(iter.hasNext()) {
			int number = iter.next();
			System.out.println(number);
		}
		
		
	}

}
