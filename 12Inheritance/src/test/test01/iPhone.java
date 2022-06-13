package test.test01;

public class iPhone extends iPodTouch {
	
	// 전화하기, 메시지 보내기
	
	private String phoneNum;
	
	public iPhone(String phoneNum) {
		super();
		this.setModel("iPhone");
		this.phoneNum = phoneNum;
	}
	
	@Override
    public String infoString() {
		return super.infoString() + "\n전화번호 : " + this.phoneNum;
    }
	
    public void calling(String num) {
    	System.out.println(num + "로 통화중");
    }

    public void sendMessage(String num2, String message) {
    	System.out.println(num2 + " 로 " + message + " 전송");
    }
    
}
