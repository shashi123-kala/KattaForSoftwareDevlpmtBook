package com.sdb.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.sdb.cart.ShoppingCart;
import com.sdb.cart.SoftwareDevelopmentBook;
import com.sdb.price.PriceCalculatorByBooksSetDiscount;
import com.sdb.price.SoftwareDevelopmentBookSetDiscount;
import com.sdb.price.SoftwareDevelopmentBooksSetFactory;


public class ShoppingCartTest {
	ShoppingCart shoppingCart;
	
	@BeforeEach
	public void setup() {
		List<SoftwareDevelopmentBookSetDiscount> byDifferentCopiesDiscountList = new ArrayList<>();

		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(2, 5));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(3, 10));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(4, 20));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(5, 25));	
		SoftwareDevelopmentBooksSetFactory booksSetFactory = new SoftwareDevelopmentBooksSetFactory(byDifferentCopiesDiscountList);
		shoppingCart = new ShoppingCart(new PriceCalculatorByBooksSetDiscount(booksSetFactory));


	}

	@Test
	public void buyingOneBook() {
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		shoppingCart.Add(sdbFirstI);
		assertEquals(50.0, shoppingCart.getTotalPrice());
	}

	@Test
	public void buyingTwoCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = Catalog.GivenASoftwareDevelopmentIIBook();
		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbSecondI);
		assertEquals(95.0, shoppingCart.getTotalPrice());
	}
	
	@Test
	public void buyingThreeCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = Catalog.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = Catalog.GivenASoftwareDevelopmentIIIBook();
		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbSecondI);
		shoppingCart.Add(sdbThirdI);
		assertEquals(135, shoppingCart.getTotalPrice());

	}
	
	@Test
	public void buyingFourCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = Catalog.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = Catalog.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbFourthIV = Catalog.GivenASoftwareDevelopmentIVBook();
		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbSecondI);
		shoppingCart.Add(sdbThirdI);
		shoppingCart.Add(sdbFourthIV);
		assertEquals(160, shoppingCart.getTotalPrice());
	}
	

}
