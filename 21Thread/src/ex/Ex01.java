package ex;

public class Ex01 {
	
	// main thread
	public static void main(String[] args) {
		
//		ThreadExtends th1 = new ThreadExtends("@@@@");
//		ThreadExtends th2 = new ThreadExtends("$$$$");
//		th1.run(); // 메인쓰레드에서 돌아가는 메소드
//		th1.start(); // 서브 쓰레드 실행
//		th2.start();
		
		ThreadImplements ti1 = new ThreadImplements("####");
		ThreadImplements ti2 = new ThreadImplements("%%%%");
		
		Thread thread1 = new Thread(ti1);
		Thread thread2 = new Thread(ti2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("main Thread");
		
		// 다른 스레드 기다리기
		try {
			thread1.join(); // 같은 예외는 하나로 처리
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("마감!!");
		
	}

}
