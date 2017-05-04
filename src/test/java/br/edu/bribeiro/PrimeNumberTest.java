package br.edu.bribeiro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeNumberTest {

	@Test
	public void until10ShouldBePrime() {
		PrimeNumber prime = new PrimeNumber();

		int number1 = 2;
		int number2 = 3;
		int number3 = 5;
		int number4 = 7;

		assertTrue(prime.isPrimeNumber(number1));
		assertTrue(prime.isPrimeNumber(number2));
		assertTrue(prime.isPrimeNumber(number3));
		assertTrue(prime.isPrimeNumber(number4));

	}

	@Test
	public void until10ShouldNOTBePrime() {
		PrimeNumber prime = new PrimeNumber();

		int number1 = 1;
		int number2 = 4;
		int number3 = 6;
		int number4 = 8;
		int number5 = 9;

		assertTrue(!prime.isPrimeNumber(number1));
		assertTrue(!prime.isPrimeNumber(number2));
		assertTrue(!prime.isPrimeNumber(number3));
		assertTrue(!prime.isPrimeNumber(number4));
		assertTrue(!prime.isPrimeNumber(number5));

	}

	@Test
	public void randomShouldBePrime() {
		PrimeNumber prime = new PrimeNumber();

		int number1 = 5501;
		int number2 = 7919;
		int number3 = 179;
		int number4 = 1381;

		assertTrue(prime.isPrimeNumber(number1));
		assertTrue(prime.isPrimeNumber(number2));
		assertTrue(prime.isPrimeNumber(number3));
		assertTrue(prime.isPrimeNumber(number4));

	}

	@Test
	public void randomShouldNOTBePrime() {
		PrimeNumber prime = new PrimeNumber();

		int number1 = 0;
		int number2 = 99;
		int number3 = 9853;
		int number4 = 2587;
		int number5 = 5385;

		assertTrue(!prime.isPrimeNumber(number1));
		assertTrue(!prime.isPrimeNumber(number2));
		assertTrue(!prime.isPrimeNumber(number3));
		assertTrue(!prime.isPrimeNumber(number4));
		assertTrue(!prime.isPrimeNumber(number5));

	}

}
