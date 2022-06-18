package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	
	public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("터키", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };
	

	public static void main(String[] args) {

		// 1. 이씨찾기
		
		Map<String, Character> members = new HashMap<>();
		
		members.put("이지은", 'X');
		members.put("서장훈", 'X');
		members.put("유재석", 'X');
		members.put("이광수", 'X');
		members.put("박나래", 'X');
		
		System.out.println(members);
		
		Set<String> nameSet = members.keySet();
		
		for(String name : nameSet) {
			if(name.startsWith("이")){
				members.put(name, 'O');
			}
		}
		System.out.println(members);
		
		// 2. 수도 맞추기 게임
		
			Scanner scan = new Scanner(System.in);
	        Random rand = new Random();

	        Set<String> conturySet = capitalMap.keySet(); //keySet 생성
	        List<String> conturyList = new ArrayList<>(conturySet); 
	        // 나라이름 List의 index로 문제 내기 위한 keyList
	        
	 
	        int sum = 0;
	        
	        for(int i = 0; i < 5; i++) {
	        	
	        	int random = rand.nextInt(conturyList.size()); //20 + 1 할필요없음
	        	
	        	String contury = conturyList.get(random); //나라이름 가져오는 변수생성
	      
	        	System.out.print(contury + "의 수도 이름은? ");
	        	String answer = scan.nextLine();
	        	
	        	String correct = capitalMap.get(contury); //나라이름으로 가져오는 수도이름
	        	
		        		if(correct.equals(answer)) {
		        			System.out.println("정답");
		        			sum += 20;
		        			
		        		} else {
		        			System.out.println("틀렸습니다.");
		        			
		        		  }
	        }
	        System.out.println("총점수는 " + sum);
	}
}
		
	
