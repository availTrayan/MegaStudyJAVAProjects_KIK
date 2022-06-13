package ex;

public class Ex02 {

	public static void main(String[] args) {

		// 문자열을 숫자로
		
		String numberString1 = "30";
		String numberString2 = "20";
		
		System.out.println(numberString1 + numberString2);
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString2);
		
		System.out.println(number1 + number2);
		
		numberString1 = String.valueOf(number1);
		numberString2 = String.valueOf(number2);
		numberString1 = number1 + " ";
		numberString2 = number2 + " ";
		
		System.out.println(numberString1 + numberString2);
		
		// 문자열 비교
		String word1 = "고양이";
		//String word2 = "고양이";
		String word2 = new String("고양이");
	
		if(word1 == word2) {
			System.out.println("두단어는 일치한다!");
		} else {
			System.out.println("두단어는 다르다!");
		}
			
		if(word1.equals(word2)){
			System.out.println("두단어는 일치한다!");
		}
		if(word1.equals("고양이")){
			System.out.println("두단어는 일치한다!");
		}
		
		
	}
	}


