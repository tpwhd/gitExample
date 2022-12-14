package ch09;

public class ProductSaleUse {

	public static void main(String[] args) {
		ProductSale s1 = new ProductSale();
		s1.input(1, "냉장고", "LG", "202203", 2000, 5);
		s1.print();
		s1.calc();
		}
	}

