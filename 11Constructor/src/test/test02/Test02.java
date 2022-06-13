package test.test02;

public class Test02 {

	public static void main(String[] args) {

		Student std = new Student("안희용", "신천중", "010-1234-5678", "국어");
		
		std.printInfo();
		std.setSchool("소래고");
		std.printInfo();
		std.sendScheduleMessage();
		std.sendMessage("잘하자!");
		
		Galaxy gal = new Galaxy("1234567890");
		
		gal.setPhoneNum("010-1234-3333");
		gal.showInfo();
		gal.callPhone("010-0000-9999");
		gal.sendMessage("010-1234-5678", "자니??");
		
	}

}
