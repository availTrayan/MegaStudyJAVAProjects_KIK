package test.test01;

public class Cat extends Animal {
	
	public Cat() {
	}
	
	@Override
	public void cry() {
		System.out.println("야용");
	}
	
	// 그루밍
	public void grooming() {
		System.out.println("할짝할짝 그루밍");
	}
}
