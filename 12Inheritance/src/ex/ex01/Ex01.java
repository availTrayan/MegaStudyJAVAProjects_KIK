package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		Person me = new Person("안희용", 28);
		me.printInfo();
		Student st = new Student("안희용", 28, "신천중");
		st.printInfo();
	}

}
