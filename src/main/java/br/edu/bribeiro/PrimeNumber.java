package br.edu.bribeiro;

public class PrimeNumber {

	public boolean isPrimeNumber(int n) {

		if (n == 0 || n == 1) {
			return false;
		}

		// even number
		if (n > 2 && n % 2 == 0) {
			return false;
		}

		// Odd numbers
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;

	}

}
