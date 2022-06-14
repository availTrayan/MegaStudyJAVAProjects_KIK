package ex.ex01;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("냐용");
	}
	
	// 그루밍
	public void grooming() {
		System.out.println("할짝");
	}
}
