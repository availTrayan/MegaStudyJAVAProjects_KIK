package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<>();
		
		// 1. 자료입력
		scores.put("국어", 90);
		scores.put("수학", 85);
		scores.put("영어", 90);
		scores.put("사회", 80);
		scores.put("과학", 100);
		
		System.out.println(scores);
		
		// 2. 값 수정
		scores.put("사회", scores.get("사회") + 5);
		System.out.println(scores);
		
		// 값 찾기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회할 과목명을 입력하세요 : ");
		String subject = scan.nextLine();
		
		if(scores.get(subject) != null) {
			System.out.println(subject + " : " + scores.get(subject));
		} else {
			System.out.println("자료없음");
		}
		// 값 찾기 4
		
		Set<String> keys = scores.keySet();
		
		for(String key : keys) {
			
			if(scores.get(key) >= 90) {
				System.out.print(key + " ");
			}
		
	}
	}
}
