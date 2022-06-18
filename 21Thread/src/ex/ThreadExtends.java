package ex;

public class ThreadExtends extends Thread {
	
	private String resource;
	
	public ThreadExtends(String resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		// 쓰레드 수행기능 재정의
		// 특정 문자열을 10번 출력
		
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
