package ex;

public class Ex01 {
	
	// 1부터 5까지만 전달 받아서 처리하는 메소드
	//아무의미 없는 메소드 생성할때 약속된 이름
	
	public static void foo(int number) throws Exception { 
		
		if(number < 1 || number > 5) {
			throw new Exception(); // 메소드 뒤에 선언이 있어야함
		}
		
	}

	public static void main(String[] args) throws Exception {

		String str = null;
		int[] array = {1, 2, 3};
		
//		str.length();
		
		try { // try문은 예외가 발생하면 하단코드까지 실행되지 않고 catch로 넘긴다
			str.length();
			array[5] = 1;
		} catch(Exception e) {
			System.out.println("예외상황 발생");
		}
//		} catch(NullPointerException e) {
//			System.out.println("NPE가 발생했다.");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 인덱스 에러 발생");
//		}
		
		// 코드를 일정시간 잠시 멈춘다.
		// 밀리세컨드 단위 1/1000
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			foo(3);
		} catch (Exception e) {
			System.out.println("잘못된 인자");
		}
		
		foo(5); // 메인메소드로 예외처리 주체를 넘길수있으나 메인에서 사용은 지양
		
	}
	
}
