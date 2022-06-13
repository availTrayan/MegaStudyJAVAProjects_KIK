package ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {

		
		// 리스트 객체 생성
		ArrayList<Integer> integerList = new ArrayList<>();
		
		// 업캐스팅 형태로 쓰는 일반적인 사용형태
		List<Integer> integerList2 = new ArrayList<>();
		
		// 값 추가하기
		integerList.add(4);
		integerList.add(8);
		
		System.out.println(integerList);
		
		integerList2.add(3);
		integerList2.add(6);
		
		integerList.addAll(integerList2);
		
		System.out.println(integerList);
		
		// 인덱스를 통한 값 삽입하기
		integerList.add(1, 5);
		System.out.println(integerList);
		
		// 인덱스로 값 변수에 저장하기
		Integer number = integerList.get(2);
		int intNumber = integerList.get(2);
		
		System.out.println(number);
		System.out.println(intNumber);
		
		// 값 수정하기
		integerList.set(0, 2);
		System.out.println(integerList);
		
		// 인덱스의 값 삭제하기
		integerList.remove(1);
		System.out.println(integerList);
		
		// 값을 삭제하기 2
		Integer removeNumber = integerList.remove(1);
		System.out.println(removeNumber);
		
		// 모든 값 지우기
		integerList.clear();
		System.out.println(integerList);
		
		
		// 문자열 리스트
		List<String> stringList = new ArrayList<>();
		stringList.add("사과");
		stringList.add("곰");
		stringList.add("의자");
		
		System.out.println(stringList);
		
		
	}

}
