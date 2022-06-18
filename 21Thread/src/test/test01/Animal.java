package test.test01;

public class Animal implements Runnable {
	
	private String roar;

	public Animal(String roar) {
		this.roar = roar;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(roar);
	
		try { 
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   }
}
