package test.test04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Test04 {

	public static void main(String[] args) {

		List<ProductManage> manage = new ArrayList<>();
		
		// 1. 제품 추가
		ProductManage pm = new ProductManage("새우깡", 1200, 150);
		manage.add(pm);
		pm = new ProductManage("육개장", 850, 30);
		manage.add(pm);
		pm = new ProductManage("신라면", 800, 15);
		manage.add(pm);
		pm = new ProductManage("천마표 팝콘", 1500, 0);
		manage.add(pm);
		
		System.out.println(manage);
		
		// 2. 제품 제거
			Iterator<ProductManage> iter = manage.iterator();
			
			while(iter.hasNext()) {
				
				ProductManage item = iter.next();
				if(item.getRemain() == 0) {
					iter.remove();
				}
				
			}
		System.out.println(manage);
	  
		// 3. 제품 판매
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("상품명 : ");
		String soldName = scan.nextLine();
		
		System.out.print("개수 : ");
		Integer soldCount = scan.nextInt();
		int sumPrice = 0;
		
		iter = manage.iterator();
		
		while(iter.hasNext()) {
			ProductManage item = iter.next();
			
			if(soldName.equals(item.getName())) {
			  sumPrice = item.getPrice() * soldCount;
			  item.setRemain(item.getRemain() - soldCount);
			}
		}
		System.out.println("가격 : " + sumPrice + "원");
		System.out.println(manage);
	
	
	// 4. 재고 관리
		
	iter = manage.iterator();
	while(iter.hasNext()) {
		ProductManage item = iter.next();
		
		if(item.getRemain() < 30) {
			System.out.println("제품명 : " + item.getName() + " 가격 : " + item.getPrice() + " 재고 : " + item.getRemain());
		}
	}
		
	}
}
