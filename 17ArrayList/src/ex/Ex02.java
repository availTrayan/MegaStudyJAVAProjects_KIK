package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");
		fruits.add("banana");
		fruits.add("banana");

		for(int i = 0; i < fruits.size(); i++) {
			
			// 인덱스 기반의 반복문
			
			 String item = fruits.get(i); 
			
			// banana 삭제
			if(item.equals("banana")) {
				fruits.remove(i);
				
			}
		}
		System.out.println(fruits);
		
		// 향상된 for문 (foreach)
		for(String item : fruits) { // String item = fruits.get(i); 후 item출력 축약
			// System.out.println(item);
			/*
			 * if(item.equals("banana")) { fruits.remove(item); }
			 */
		}
		System.out.println(fruits);
		
		// Iterator 활용
		Iterator<String> iter = fruits.iterator(); //리스트 반복문에서 값 삭제는 iterator 무조건사용
		
		while(iter.hasNext()) {
			
			String item = iter.next();
			// System.out.println(item);
			if(item.equals("banana")) {
				iter.remove();
			}
		}
		System.out.println(fruits);
		
		
	}

}
