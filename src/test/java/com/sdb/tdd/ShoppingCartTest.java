package com.sdb.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.sdb.cart.ShoppingCart;
import com.sdb.cart.SoftwareDevelopmentBook;
import com.sdb.price.SoftwareDevelopmentBookSetDiscount;


public class ShoppingCartTest {
	ShoppingCart shoppingCart = new ShoppingCart();
	
	@BeforeEach
	public void setup() {
		List<SoftwareDevelopmentBookSetDiscount> byDifferentCopiesDiscountList = new ArrayList<>();

		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(2, 5));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(3, 10));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(4, 20));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(5, 25));	

	}

	@Test
	public void buyingOneBook() {
		List<SoftwareDevelopmentBook> sdbList = new ArrayList<SoftwareDevelopmentBook>();
		double discount = 0;
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		sdbList.add(sdbFirstI);
		assertEquals(50.0, shoppingCart.getTotalPrice(sdbList, discount));
	}

	@Test
	public void buyingTwoCopiesOfDifferentBook() {
		List<SoftwareDevelopmentBook> sdbList = new ArrayList<SoftwareDevelopmentBook>();
		double discount = 5;
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = Catalog.GivenASoftwareDevelopmentIIBook();
		sdbList.add(sdbFirstI);
		sdbList.add(sdbSecondI);
		assertEquals(95.0, shoppingCart.getTotalPrice(sdbList, discount));
	}

}
