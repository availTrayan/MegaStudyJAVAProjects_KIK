package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {

		// 1.파티원 구하기
		// 필요한 파티원의 정보를 출력
		// 탐색시 Iterator 사용
		// myCharacter와 같은 서버의 힐러직업을 가진 멤버후보를 모두 출력
		// 같은 서버의 힐러 중 레벨이 가장 높은 사람만 출력
		
		Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("닉네임", "마로비아나");
        myCharacter.put("직업", "마법사");
        myCharacter.put("서버", "B");
        myCharacter.put("레벨", "38");

        // [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
        List<Map<String, String>> characters = new ArrayList<>();
        
        Map<String, String> character1 = new HashMap<>();
        character1.put("닉네임", "사자고양이");
        character1.put("직업", "전사");
        character1.put("서버", "A");
        character1.put("레벨", "11");
        characters.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("닉네임", "하구루");
        character2.put("직업", "마법사");
        character2.put("서버", "B");
        character2.put("레벨", "46");
        characters.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("닉네임", "바다");
        character3.put("직업", "힐러");
        character3.put("서버", "B");
        character3.put("레벨", "23");
        characters.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("닉네임", "초보");
        character4.put("직업", "힐러");
        character4.put("서버", "A");
        character4.put("레벨", "4");
        characters.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("닉네임", "남라");
        character5.put("직업", "힐러");
        character5.put("서버", "B");
        character5.put("레벨", "84");
        characters.add(character5);

        // TODO: 구현
        
        int maxLevel = 0;
        
        Map<String, String> maxHealer = null; // 최대레벨 힐러를 구하기위한 힐러 맵정보 저장
        
        for(Map<String, String> character : characters) {
        	
        	String myServer = myCharacter.get("서버");
	        if(character.get("서버").equals(myServer) && character.get("직업").equals("힐러")) {
	        	
	        	int level = Integer.parseInt(character.get("레벨"));
	        	
	        	// if(maxHealer == null){
	        	//	maxHealer = character;
	        	//	continue;
	        	//	}
	        	
	        	// String levelString = character.get("레벨");
	        	// int level = Intger.parseInt(levelString);
	        	
	        	// String maxLevelString = maxHealer.get("레벨");
	        	// int maxLevel = Intger.parseInt(maxLevelString);
	        	
	        	if(maxLevel < level) {
	        		maxLevel = level;
	        	
	        		maxHealer = character;
	        
	        	}
	        } 	
	     }
        System.out.println("힐러 탐색 결과");
    	System.out.println("닉네임 : " + maxHealer.get("닉네임"));
    	System.out.println("직업 : " + maxHealer.get("직업"));
    	System.out.println("서버 : " + maxHealer.get("서버"));
    	System.out.println("레벨 : " + maxLevel);
      
}
}

