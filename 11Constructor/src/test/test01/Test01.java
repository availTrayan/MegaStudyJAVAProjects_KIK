package test.test01;

public class Test01 {

	public static void main(String[] args) {

		CircleClass circle = new CircleClass(8);
		
		System.out.println("원의 넓이 : " + circle.area(8));
		System.out.println("원의 둘레 : " + circle.girth(8));
		System.out.println("원 25개 넓이 : " + circle.sumArea(25));
		
		ProductMange product = new ProductMange("새우깡", 1300, "2021-03-02");
		product.printInfo();
		
		if(product.availableSale("2022-06-02")){ 
			System.out.println("판매가능 상품"); 
			} else { 
			 System.out.println("판매불가 상품"); 
		 }
		
	}

}
