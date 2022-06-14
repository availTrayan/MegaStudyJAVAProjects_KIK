package ex.ex01;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("岿");
	}

	public void lash() {
		System.out.println("部府 如甸如甸");
	}
	
}
