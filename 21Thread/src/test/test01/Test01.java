package test.test01;

public class Test01 {

	public static void main(String[] args) {

		
		Animal tiger = new Animal("어흥");
		Animal cow = new Animal("음메");
		Animal horse = new Animal("히잉");
		
		Thread thread1 = new Thread(tiger);
		Thread thread2 = new Thread(cow);
		Thread thread3 = new Thread(horse);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join(); // 같은 예외는 하나로 처리
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread3.start();
		
		
		
	}

}
