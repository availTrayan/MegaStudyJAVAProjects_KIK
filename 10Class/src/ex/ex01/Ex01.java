package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		// 과목, 성적, 석차

		ScoreData korean = new ScoreData();
		
		korean.name = "국어";
		korean.score = 95;
		korean.ranking = 5;
		
		System.out.println(korean.name + " : " + korean.score + "점");
	}

}
