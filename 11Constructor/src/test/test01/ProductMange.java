package test.test01;

public class ProductMange {
	
	private String name;
	private int price;
	private String expiration;
	
	
	public ProductMange(String name, int price, String expiration) {
		this.name = name;
		this.price = price;
		this.expiration = expiration;
	}
	
	int sumPrice(int count) {
		int result = this.price * count;
		return result;
	}
	

	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("유통기한 : " + expiration);
	}
	
	boolean availableSale(String today) {
		
		// 크다 같다 작다
		// 왼쪽이 더 크면 1
		// 같으면 0
		// 오른쪽이 더 크면 -1
		/*
		 * if(expiration.compareTo(today) == -1) { return false; } else { return true; }
		 */
		
		// "2021-03-02" 분리
		String[] dates = expiration.split("-");
		String[] todays = today.split("-");
		// 유통기한 년월일 변수
		int year = Integer.parseInt(dates[0]);
		int month = Integer.parseInt(dates[1]);
		int day = Integer.parseInt(dates[2]);
		
		// 오늘 날짜 년원일 변수
		int todayYear = Integer.parseInt(todays[0]);
		int todayMonth = Integer.parseInt(todays[1]);
		int todayDay = Integer.parseInt(todays[2]);
		
		// "2021-03-02"
		// "2022-06-02"
		
		// 연도가 오늘보다 큰 경우
		if(year > todayYear) {
			return true;
		} else if(year == todayYear && month > todayMonth) { // 연도가 같으면서 
		
			return true;
		} else if(year == todayYear && month == todayMonth && day >= todayDay){
			return true;
		}
		
		return false;
	}
}
