package test.test04;

public abstract class Test04 {

	public static void main(String[] args) {

		Lotto lot = new Lotto();
		/*
		 * lot.manualMarking(5, 7, 13, 22, 38, 44); lot.printNums();
		 * 
		 * lot.AutoMarking(); lot.printNums();
		 */
		
		LottoChecker lc = new LottoChecker();
		lc.drawWinNums();
		lc.printWinNums();
		
		//System.out.println(lc.checkWin(lot));
		
		// 로또를 몇장 구매했을 때 1등 당첨될지 예측
		for(int i = 0; i < 100000; i++) {
		String result = lc.checkWin(lot);
		if(result.equals("1등")) {
			System.out.println("1등!!!");
		}
	 }
		
	}

}
