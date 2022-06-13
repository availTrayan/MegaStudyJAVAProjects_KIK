package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 육개장 가격 저장하기
		
		int noodlecup = 900;
		System.out.println(noodlecup);
		
		// 문장 이어서 출력하기 , 문자열 연산
		
		System.out.println("육개장 가격 : " + noodlecup + "원");
		
		// 줄 바꿈
		System.out.println("안녕하세요 \n반가워요~~");
		
		// 따옴표 활용하기
		System.out.println("나는 일요일에 \"닥터 스트레인지\"를 보았다");
		
		// 연산
		 
		// 육개장 3개의 총 가격
		int sum = noodlecup * 3;
		System.out.println("육개장 3개의 가격: " + sum + "원");
		
		// 육개장 가격 인상
		noodlecup = noodlecup + 50;
		sum = noodlecup * 3;
		System.out.println("인상된 육개장 3개의 가격: " + sum + "원");
		
		// 10,000원으로 살수 있는 최대 육개장 개수
		int money = 10000;
		int count = money / noodlecup;
		System.out.println("용돈으로 살 수 있는 육개장의 최대 갯수 = " + count + "개");
		
		// 잔돈 계산
		int change = money - (noodlecup * count);
		System.out.println("잔돈 : " + change + "원");
		
	}
}
