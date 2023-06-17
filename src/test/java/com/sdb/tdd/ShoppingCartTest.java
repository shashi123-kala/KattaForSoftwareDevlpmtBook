package com.sdb.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.sdb.cart.ShoppingCart;
import com.sdb.cart.SoftwareDevelopmentBook;

public class ShoppingCartTest {
	ShoppingCart shoppingCart = new ShoppingCart();

	@Test
	public void buyingOneBook() {
		List<SoftwareDevelopmentBook> sdbList = new ArrayList<SoftwareDevelopmentBook>();
		double discount = 0;
		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook("Clean Code (Robert Martin, 2008)");
		sdbList.add(sdbFirstI);
		assertEquals(50.0, shoppingCart.getTotalPrice(sdbList,  discount));
	}
	
	
	
}
