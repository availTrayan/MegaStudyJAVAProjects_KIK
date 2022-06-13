package test.test01;

public class Test01 {

	public static void main(String[] args) {

		phoneData galaxy = new phoneData();
		galaxy.company = "samsung";
		galaxy.product = "갤럭시s10e";
		galaxy.phoneNumber = "01012345678";
		
		phoneData iphone = new phoneData();
		iphone.company = "apple";
		iphone.product = "iphoneSE";
		iphone.phoneNumber = "0109876543";
		
		System.out.println(galaxy.company);
		System.out.println(galaxy.product);
		System.out.println(galaxy.phoneNumber);
		
		System.out.println(iphone.company);
		System.out.println(iphone.product);
		System.out.println(iphone.phoneNumber);
		
				
		
		StudentData yjs = new StudentData();
		yjs.name = "유재석";
		yjs.age = 21;
		yjs.subject = "java";
		yjs.phone = "0102345223";
		
		StudentData lhr = new StudentData();
		lhr.name = "이효리";
		lhr.age = 23;
		lhr.subject = "java";
		lhr.phone = "01096482734";
		
		System.out.println(yjs.name);
		System.out.println(yjs.age);
		System.out.println(yjs.subject);
		System.out.println(yjs.phone);
		
		System.out.println(lhr.name);
		System.out.println(lhr.age);
		System.out.println(lhr.subject);
		System.out.println(lhr.phone);
		
		// StudentData[] students = {yjs, lhr};
		StudentData[] students = new StudentData[2];
		students[0] = yjs;
		students[1] = lhr;
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].age);
			System.out.println(students[i].subject);
			System.out.println(students[i].phone);
		}
		
	}

}
