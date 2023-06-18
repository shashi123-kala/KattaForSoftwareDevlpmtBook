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
		SoftwareDevelopmentBooksSetFactory booksSetFactory = new SoftwareDevelopmentBooksSetFactory(
				byDifferentCopiesDiscountList);
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

	@Test
	public void buyingFiveCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = Catalog.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = Catalog.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbFourthIV = Catalog.GivenASoftwareDevelopmentIVBook();
		SoftwareDevelopmentBook sdbFifthI = Catalog.GivenASoftwareDevelopmentVBook();
		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbSecondI);
		shoppingCart.Add(sdbThirdI);
		shoppingCart.Add(sdbFourthIV);
		shoppingCart.Add(sdbFifthI);
		assertEquals(187.50, shoppingCart.getTotalPrice());
	}

	@Test
	public void buyingTwoCopiesOfThreeDiffBookAndOneCpyOfTwoDiffBook() {
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstII = Catalog.GivenASoftwareDevelopmentIBook();

		SoftwareDevelopmentBook sdbSecondI = Catalog.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecondII = Catalog.GivenASoftwareDevelopmentIIBook();

		SoftwareDevelopmentBook sdbThirdI = Catalog.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdII = Catalog.GivenASoftwareDevelopmentIIIBook();

		SoftwareDevelopmentBook sdbFourthI = Catalog.GivenASoftwareDevelopmentIVBook();

		SoftwareDevelopmentBook sdbFifthI = Catalog.GivenASoftwareDevelopmentVBook();
		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbFirstII);
		shoppingCart.Add(sdbSecondI);
		shoppingCart.Add(sdbSecondII);
		shoppingCart.Add(sdbThirdI);
		shoppingCart.Add(sdbThirdII);
		shoppingCart.Add(sdbFourthI);
		shoppingCart.Add(sdbFifthI);
		assertEquals(320, shoppingCart.getTotalPrice());

	}

	@Test
	public void buyingTwoCopiesOfTwoDiffBookAndThreeCopyOfOneBookAndOneCpyofOthrBook() {
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstII = Catalog.GivenASoftwareDevelopmentIBook();

		SoftwareDevelopmentBook sdbSecondI = Catalog.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecondII = Catalog.GivenASoftwareDevelopmentIIBook();

		SoftwareDevelopmentBook sdbThirdI = Catalog.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdII = Catalog.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdIII = Catalog.GivenASoftwareDevelopmentIIIBook();

		SoftwareDevelopmentBook sdbFourthI = Catalog.GivenASoftwareDevelopmentIVBook();
		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbFirstII);
		shoppingCart.Add(sdbSecondI);
		shoppingCart.Add(sdbSecondII);
		shoppingCart.Add(sdbThirdI);
		shoppingCart.Add(sdbThirdII);
		shoppingCart.Add(sdbThirdIII);
		shoppingCart.Add(sdbFourthI);
		assertEquals(345.00, shoppingCart.getTotalPrice());

	}

	@Test
	public void buyingFiveCpsOfSingleBookWithOneCopyOfSingleBookAndTwoCpyOfSinglBook() {
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstII = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstIII = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstIV = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstV = Catalog.GivenASoftwareDevelopmentIBook();

		SoftwareDevelopmentBook sdbSecondI = Catalog.GivenASoftwareDevelopmentIIBook();

		SoftwareDevelopmentBook sdbThirdI = Catalog.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdII = Catalog.GivenASoftwareDevelopmentIIIBook();

		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbFirstII);
		shoppingCart.Add(sdbFirstIII);
		shoppingCart.Add(sdbFirstIV);
		shoppingCart.Add(sdbFirstV);
		shoppingCart.Add(sdbSecondI);
		shoppingCart.Add(sdbThirdI);
		shoppingCart.Add(sdbThirdII);
		System.out.println("9   " + shoppingCart.getTotalPrice());
		assertEquals(380.00, shoppingCart.getTotalPrice());

	}

	@Test
	public void buyingfourCpsOfOneBookWithThreeCopsOfoneBookAndOneCpyOfOneBook() {
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstII = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstIII = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstIV = Catalog.GivenASoftwareDevelopmentIBook();

		SoftwareDevelopmentBook sdbSecondI = Catalog.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecondII = Catalog.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecondIII = Catalog.GivenASoftwareDevelopmentIIBook();

		SoftwareDevelopmentBook sdbThirdI = Catalog.GivenASoftwareDevelopmentIIIBook();

		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbFirstII);
		shoppingCart.Add(sdbFirstIII);
		shoppingCart.Add(sdbFirstIV);
		shoppingCart.Add(sdbSecondI);
		shoppingCart.Add(sdbSecondII);
		shoppingCart.Add(sdbSecondIII);
		shoppingCart.Add(sdbThirdI);
		assertEquals(375.00, shoppingCart.getTotalPrice());

	}

	@Test
	public void buyingThreeCpyOfTwoDifftBookWithTwoCopsOfoneBook() {

		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstII = Catalog.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstIII = Catalog.GivenASoftwareDevelopmentIBook();

		SoftwareDevelopmentBook sdbSecI = Catalog.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecII = Catalog.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecIII = Catalog.GivenASoftwareDevelopmentIIBook();

		SoftwareDevelopmentBook sdbThirdI = Catalog.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdII = Catalog.GivenASoftwareDevelopmentIIIBook();

		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbFirstII);
		shoppingCart.Add(sdbFirstIII);
		shoppingCart.Add(sdbSecI);
		shoppingCart.Add(sdbSecII);
		shoppingCart.Add(sdbSecIII);
		shoppingCart.Add(sdbThirdI);
		shoppingCart.Add(sdbThirdII);
		assertEquals(365.00, shoppingCart.getTotalPrice());
	}

	@Test
	public void buyingOneCpyOfTwoDifftBookWithTwoCpysOfThreeDifftBook () {
		
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();			
		
		SoftwareDevelopmentBook sdbSecI = Catalog.GivenASoftwareDevelopmentIIBook();
		
		SoftwareDevelopmentBook sdbThirdI = Catalog.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdII = Catalog.GivenASoftwareDevelopmentIIIBook();
		
		SoftwareDevelopmentBook sdbFourthI = Catalog.GivenASoftwareDevelopmentIVBook();
		SoftwareDevelopmentBook sdbFourthII = Catalog.GivenASoftwareDevelopmentIVBook();
		
		SoftwareDevelopmentBook sdbFifthI = Catalog.GivenASoftwareDevelopmentVBook();
		SoftwareDevelopmentBook sdbFifthII = Catalog.GivenASoftwareDevelopmentVBook();
		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbSecI);
		shoppingCart.Add(sdbThirdI);
		shoppingCart.Add(sdbThirdII);
		shoppingCart.Add(sdbFourthI);
		shoppingCart.Add(sdbFourthII);
		shoppingCart.Add(sdbFifthI);
		shoppingCart.Add(sdbFifthII);
		assertEquals(322.50, shoppingCart.getTotalPrice());

	}
	
	@Test
	public void buyingOneCpyOfTwoDifftBookWithThreeCpysOfOneBookAndTwoCpyofOneBookwithOneCopyOfoneBook () {
		
		SoftwareDevelopmentBook sdbFirstI = Catalog.GivenASoftwareDevelopmentIBook();
		
		SoftwareDevelopmentBook sdbSecI = Catalog.GivenASoftwareDevelopmentIIBook();
		
		SoftwareDevelopmentBook sdbThirdI = Catalog.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdII = Catalog.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdIII = Catalog.GivenASoftwareDevelopmentIIIBook();
		
		SoftwareDevelopmentBook sdbFourthI = Catalog.GivenASoftwareDevelopmentIVBook();			
		SoftwareDevelopmentBook sdbFourthII = Catalog.GivenASoftwareDevelopmentIVBook();
		
		SoftwareDevelopmentBook sdbFifthI = Catalog.GivenASoftwareDevelopmentVBook();	
		
		shoppingCart.Add(sdbFirstI);
		shoppingCart.Add(sdbSecI);
		shoppingCart.Add(sdbThirdI);
		shoppingCart.Add(sdbThirdII);
		shoppingCart.Add(sdbThirdIII);
		shoppingCart.Add(sdbFourthI);
		shoppingCart.Add(sdbFourthII);
		shoppingCart.Add(sdbFifthI);
		assertEquals(332.50, shoppingCart.getTotalPrice());

	}
	

}
