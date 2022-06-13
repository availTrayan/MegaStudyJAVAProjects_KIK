package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		// 1. 문자열 검색
		/*
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int jpgCount = 0;
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].endsWith("jpg")){
				jpgCount++;
			}
		}
		System.out.println("jpg 파일 개수 : " + jpgCount);
		*/
		
		// 2. 영 단어 퀴즈
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("승리를 영어로 입력하세요 : ");
		System.out.println("사람을 영어로 입력하세요 : ");
		System.out.println("컴퓨터를 영어로 입력하세요 : ");
		System.out.println("노트북을 영어로 입력하세요 : ");
		
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		String word3 = sc.nextLine();
		String word4 = sc.nextLine();
		
		String word1Answer = "victory";
		String word2Answer = "love";
		String word3Answer = "computer";
		String word4Answer = "notebook";
		
		int point = 0;
		
		if(word1.equals(word1Answer)) {
			point += 25;
		} 
		if(word2.equals(word2Answer)) {
			point += 25;
		} 
		if(word3.equals(word3Answer)) {
			point += 25;
		} 
		if(word4.equals(word4Answer)) {
			point += 25;
		} 
	
		System.out.println("점수는 "  + point + "점 입니다.");
		*/
		
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
