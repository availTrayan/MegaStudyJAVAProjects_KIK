package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 벤치프레스 10회 3세트
		for(int i = 0; i < 3; i++) {
			// 벤치프레스 10회
			for(int j = 0; j < 10; j++) {
				System.out.print("들숨 날숨! ");
			}
			System.out.println();
		}
		
		// n세트 n번째 출력
		for(int i = 1; i < 3; i++) {
			
			// 벤치프레스 10회
			for(int j = 1; j < 10; j++) {
				System.out.print(i + "세트 " + j + "개째 " );
			}
			System.out.println();
		}
		
		// 00 01 02 03 01 05 06 07 08 09
		// 10 11 12 13 14 15 16 17 18 19
		// 20 21 22 23 24 25 26 27 28 29
		// 30 31 32 33 34 35 36 37 38 39
		// 40 41 42 43 44 45 46 47 48 49
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 9; j++) {
				System.out.print(i + " "+ j + " ");
			}
			System.out.println();
		}

	}

}
