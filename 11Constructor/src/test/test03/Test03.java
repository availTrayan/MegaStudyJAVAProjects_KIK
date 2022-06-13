package test.test03;

public class Test03 {

	public static void main(String[] args) {
		
		OmrCard myCard = new OmrCard("김인규", "202202452");
		int[] myAnswer = {5, 3, 2, 3, 1};
		myCard.setMarking(myAnswer);
		
		myCard.setMarking(3, 4, 5, 5, 3);
		
		myCard.printInfo();
		
		OmrCardReader reader = new OmrCardReader();
		reader.setAnswers(3, 3, 2, 1, 3);
		reader.printInfo();
		
		reader.printResult(myCard);
		
		OmrCard[] omrCards = new OmrCard[3];
		omrCards[0] = new OmrCard("김인규", "20221245");
		omrCards[1] = new OmrCard("유재석", "20221255");
		omrCards[2] = new OmrCard("조세호", "20221265");
		
		omrCards[0].setMarking(2, 3, 3, 2, 1);
		omrCards[1].setMarking(3, 3, 1, 2, 1);
		omrCards[2].setMarking(2, 4, 1, 2, 1);
		
		reader.printResult(omrCards);
	}

}
