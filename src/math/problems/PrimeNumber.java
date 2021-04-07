package math.problems;

import java.lang.Math;

public class PrimeNumber {

	static boolean isPrime(int n){
		for (int j = 2 ; j <= Math.sqrt(n); j++ ){
			if (n % j == 0){
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 *
		 */
		int n =1000000;
		for (int i = 2; i <= n ; i++){
			if(isPrime(i)){
				System.out.print(i + " ");
			}
		}

	}

}
