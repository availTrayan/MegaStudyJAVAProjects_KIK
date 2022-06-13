package ex;

public class Ex03 {

	public static void main(String[] args) {
		
		int weight = 72;
		// 몸무게가 70이하면 치킨 먹자
		// 그렇지 않으면 샐러드 먹자
		
		if(weight <= 70) {
			System.out.println("치킨 먹자");
		} else {
			System.out.println("샐러드 먹자");
		}
		
		// 몸무게가 70이하면 치킨먹자
		// 그렇지 않고 몸무게가 75이하면 닭가슴살 먹자
		// 그렇지 않고 뭄무게가 80이하면 샐러드나 먹자
		// 그렇지 않으면 굶어!!
		
		if (weight <= 70) {
			System.out.println("치킨 먹자");
		} else if (weight <= 75){
			System.out.println("닭가슴살 먹자 !!");
		} else if (weight <= 80) {
				System.out.println("샐러드 먹자");
		} else {
			System.out.println("굶어!!");
			
		}

	}

}
