package Assign1201;

import java.util.ArrayList;
import java.util.List;

public class ProductUse {
	public static void main(String[] args) {
		List<Product> l = new ArrayList<>();
		System.out.println("2건의 제품정보를 입력하세요 : ");
		Product p1 = new Product();
		p1.input();
		Product p2 = new Product();
		p2.input();
		l.add(p1);
		l.add(p2);
		
		System.out.println("--------------------------------------------");
		System.out.println("제품번호\t제품명\t제조사\t단가\t수량\t금액");
		System.out.println("--------------------------------------------");
		for(Product p : l) {
			System.out.println(p.getNum() + "\t" + p.getName() + "\t" + 
		p.getCpn() + "\t" + p.getPrice() + "\t" + p.getAmount() + "\t" + p.getMoney());
			System.out.println("--------------------------------------------");
		}
	}
}
