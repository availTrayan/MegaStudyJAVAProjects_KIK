package test;

public class EntertainerApplicant implements Sing, Act {

	@Override
	
	public void sing() {

		System.out.println("노래");
		
	}

	@Override
	public void act() {
		System.out.println("연기");
	}
	

}
