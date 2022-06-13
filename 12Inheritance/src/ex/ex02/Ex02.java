package ex.ex02;

public class Ex02 {

	public static void main(String[] args) {

		Person02 me = new Person02("안희용", 21);
		System.out.println(me.printInfo());
		System.out.println(me); // toString() 재정의로 객체명 호출로 내용확인
		
	}

}
