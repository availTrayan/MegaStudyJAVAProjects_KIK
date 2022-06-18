package ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		// id - 이름 (key - value)
		
		Map<String, String> ids = new HashMap<>();
		ids.put("trayan", "안희용");
		ids.put("yoo", "유재석");
		
		System.out.println(ids);
		
		//수정
		ids.put("trayan", "박명수");
		System.out.println(ids);
		// 검색
		System.out.println(ids.get("trayan"));
		
		//키가 포함되어 있는지
		if(ids.containsKey("yoo")){
			System.out.println("yoo 키가 존재");
		}
		
		Set<String> keys = ids.keySet();
		System.out.println(keys);
		
		for(String key : keys) {
			System.out.println(key + " : " + ids.get(key));
		}
		
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " : " + ids.get(key));

		}
		
		ids.remove("trayan");
		System.out.println(ids);
		
		// 클래스와 비슷하게 활용
		// 이름 나이 저장하는 맵
		Map<String, String> person = new HashMap<>();
		person.put("name", "안희용");
		person.put("age", "29");
		
		//person.name, person.age
		System.out.println(person.get("name"));
		System.out.println(person.get("age"));
		
	}

}
