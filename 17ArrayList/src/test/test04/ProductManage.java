package test.test04;

public class ProductManage {
	
	private String name;
	private int price;
	private int remain;
	
	public ProductManage(String name, int price, int remain) {
		
		this.name = name;
		this.price = price;
		this.remain = remain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}
	
	@Override
	public String toString() {
		return "(제품명 : " + this.name + " 가격 : " + this.price + " 재고 : " + this.remain + ")";
	}
	
	public void updateProduct() {
		
	}
	
}
