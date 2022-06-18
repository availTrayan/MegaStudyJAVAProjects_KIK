package ex;

public class ThreadImplements implements Runnable { 
	
	// Runnable의 run 구현 클래스 
	
	private String resource;
	
	public ThreadImplements(String resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(resource);
		
		
		// 동시실행중인 쓰레드간 작업전환 확인하기위한 1초 간격 지정
		try { 
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
