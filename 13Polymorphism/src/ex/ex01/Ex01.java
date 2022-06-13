package ex.ex01;

import test.test01.Animal;
import test.test01.Cat;
import test.test01.Dog;

public class Ex01 {
	
	// 동물의 울음소리를 내게 하는 메소드
	public static void cryAnimal(Animal animal) {
		animal.cry();
	}
	
	public static void main(String[] args) {

		Dog dog = new Dog("멍이");
		dog.eat();
		dog.cry();
		dog.lash();
		
		Cat cat = new Cat("냥이");
		cat.eat();
		cat.cry();
		cat.grooming();
		
		// 업캐스팅
		// 부모클래스 변수로 자식 클래스 객체 저장
		
		// int num = 10;
		// double doubleNum = num;
		// int num2 = (int)doubleNum;
		
		Animal animal = new Dog("동물"); // dog를 animal 클래스 이름으로 저장
		animal.eat();
		animal.cry();
		
		// 다운캐스팅
		Dog dog2 = (Dog)animal; //  animal을 dog 클래스 이름으로 저장
		dog2.lash();
		
		// 업캐스팅 활용 animal 상속객체들을 하나의 메소드로 울게
		cryAnimal(cat);
		cryAnimal(dog);
		
		// 업캐스팅 활용2
		Animal[] animals = new Animal[2];
		animals[0] = dog;
		animals[1] = cat;
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].cry();
			
			// 특정 개체가 특정 클래스인지 확인
			if(animals[i] instanceof Cat) {
			// 고양이는 그루밍
			Cat bada = (Cat)animals[i];
			bada.grooming();
			}
		}
		
	}
}
