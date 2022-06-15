package ex.ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {

		List<Member> memberList = new ArrayList<>();
		
		Member member = new Member("안희용", "010-1234-5678");
		memberList.add(member);
		member = new Member("유재석", "010-1344-7788");
		memberList.add(member);
		
		memberList.add(new Member("강호동", "010-5234-1255"));
		memberList.add(new Member("이효리", "010-5354-1285"));
		
		System.out.println(memberList); // List의 객체는 주소만 저장하므로 toString을 정의해야한다.
	
		Member me = memberList.get(0);
		System.out.println(me.getName());
		
		for(int i = 0; i < memberList.size(); i++) {
			Member item = memberList.get(i);
			System.out.println("이름1 : "  + item.getName());
		}
		
		for(Member item : memberList) {
			System.out.println("이름2 : "  + item.getName());

		}
		
		// 이름이 유씨인 사람만 출력
		for(Member item : memberList) {
			String name = item.getName();
			
			if(name.startsWith("유")) {
			System.out.println("유씨 : "  + name);
			}
		}
		
		Iterator<Member> iter = memberList.iterator();
		while(iter.hasNext()) {
			Member item = iter.next();
			System.out.println("전화번호 : " + item.getPhoneNum());
			
		}
		
		
	}

}
