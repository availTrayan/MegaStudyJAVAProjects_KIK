package test.test04;

import java.util.Random;

public class LottoChecker {
	
	// 당첨번호
	private int[] winNums;
	
	public LottoChecker() {
		this.winNums = new int[6];
	}

	// 추첨기능 - 당첨번호 만들기 
	
	public void drawWinNums() {
		Random rand = new Random();
		for(int i = 0; i < winNums.length; i++) {
				int randomNum = rand.nextInt(45)+1;
				this.winNums[i] = randomNum;
						
			for(int j = 0; j < i; j++) { //현재 뽑힌 개수는 i
				if(randomNum == this.winNums[j]) {
					// 중복이 나오면 i를 다시 반복해서 뽑기
						i--; 
					break;
				}
			}
		}
	}
	
	// 당첨번호 출력
	public void printWinNums() {
		for(int i = 0; i < this.winNums.length; i++) {
			System.out.print(this.winNums[i] + " ");
		}
		System.out.println();
	}
	
	public String checkWin(Lotto lot) {
		
		int count = 0;
		int[] markings = lot.getMarkings();
		
		for(int i = 0; i < markings.length; i++) {
			
			int target = markings[i]; // 일치여부 확인할 대상숫자 지정
			for(int j = 0; j < this.winNums.length; j++) {
				if(target == this.winNums[j]) {
					count++;
					break;
				}
			}
		}
		
		switch (count) {
		case 6 : 
			return "1등";
			// break; return을 하면 break 필요없음
		case 5 : 
			return "2등";
		case 4 : 
			return "3등";
		case 3 : 
			return "4등";
		case 2 : 
			return "5등";
		default : 
			return "꽝!";
		}
		
	}
	
		
}
	
	

