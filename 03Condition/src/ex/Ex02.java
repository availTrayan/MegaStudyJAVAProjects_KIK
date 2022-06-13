package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		// 만보를 걷고 몸무게 70이하면 치킨먹자
		// 만보를 걷는다 그리고 몸무게가 70이하이다. 그러면 치킨먹자

		int walking = 10000;
		int weight = 68;
		
		if (walking > 10000 && weight <= 70) {
			System.out.println("치킨먹자");
		} 
		
		// 만보가 넘거나 몸무게가 70이하면 치킨먹자
		// 만보가 넘는다 또는 몸무게가 70이하다 그러면 치킨먹자
		
		if (walking > 10000 || weight <= 70 ) {
			System.out.println("치킨먹자 !!!!");
		}
		
		int number = 30;
		// 10 <= number <= 40 
		if(10 <= number && number <= 40) {
			System.out.println("10보다 크고 40보다 작다");
		}
		// 10 > number , number > 40
		if ( 10 > number || number > 40) {
			System.out.println("10보다 작거나 40보다 큰수");
		}
		
	}

}
