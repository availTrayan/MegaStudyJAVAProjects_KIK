package test.test01;

public class Test01 {

	public static void main(String[] args) {

		iPhone ip = new iPhone("010-1234-5678");
		System.out.println(ip.infoString());
		ip.calling("010-000-0000");
		ip.internetBrowsing("naver");
		ip.sendMessage("010-3234-3477", "대문자 소문자 잘보세요");
	}

}
