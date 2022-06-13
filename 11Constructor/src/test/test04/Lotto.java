package test.test04;

import java.util.Random;

public class Lotto {
	
	// 마킹을 저장할 배열
	private int[] markings;
	
	public Lotto() {
	// 생성자에서 마킹한 배열을 초기화	
		this.markings =  new int [6];
	}
	
	// 수동으로 번호 마킹
	public void manualMarking(int mark1, int mark2, int mark3, int mark4, int mark5, int mark6) {
		this.markings[0] = mark1;
		this.markings[1] = mark2;
		this.markings[2] = mark3;
		this.markings[3] = mark4;
		this.markings[4] = mark5;
		this.markings[5] = mark6;
	}
	
	// 자동으로 번호 마킹
	public void AutoMarking() {
		
		Random rand = new Random();

		for(int i = 0; i < 6; i++) {
			int randomNum = rand.nextInt(45) + 1;
			this.markings[i] = randomNum;
			
			// 새롭게 뽑힌수가 이미 배열에 있는지 확인
			
			for(int j = 0; j < i; j++) { //현재 뽑힌 개수는 i
				if(randomNum == this.markings[j]) {
					// 중복이 나오면 i를 다시 반복해서 뽑기
					i--; 
					break;
				}
			}
		}
	}

	
	// 마킹한 번호 확인용
	public void printNums() {
		
		for(int i = 0; i < markings.length; i++) {
			System.out.print(markings[i] + " ");
		}
		System.out.println();
	}
	
	public int[] getMarkings() {
		return this.markings;
	}


	
	
	
	
	
	
}
