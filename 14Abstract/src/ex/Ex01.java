package ex;

public class Ex01 {

	public static void main(String[] args) {

		Dog dog = new Dog();// abstract 클래스로 객체 생성불가
		dog.cry();
		
		Animal animal = dog;
		animal.cry();
		Animal animal2 = new Cat();
		animal2.cry();
		
		System.out.println(animal);
		
		
	}

}
