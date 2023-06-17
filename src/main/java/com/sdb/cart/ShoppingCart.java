package com.sdb.cart;

import java.util.List;

public class ShoppingCart {

	public double getTotalPrice(List<SoftwareDevelopmentBook> bookList,  double dis) {
		double amtAfterDis = 0.00;
		int n =bookList.size();		
		double count =  n * 50.00;
		amtAfterDis = count - (count * (dis / 100));
		return amtAfterDis;
	}

}
