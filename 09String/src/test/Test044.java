package test;

public class Test044 {

	public static void main(String[] args) {

		// 3. 문자열 검색
		
				String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
				
				String[] members = membersString.split(":");
				
				int equalsCount = 0;
				
				for(int i = 0; i < members.length; i++) {
					String targetMember = members[i];
					int count = 0;
					if(targetMember.equals(" ")) {
						continue;
					}
					
					
					for(int j = 0; j < members.length; j++) {
						if(targetMember.equals(members[j])) {
							count++;
							members[j] = "";
						}
						
						if(count > 1) {
							equalsCount++;
							break;
						}
					}
				}
				System.out.println("동명 이인 수 : " + equalsCount);
		
	}

}
