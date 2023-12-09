package viva2;

import java.util.*;

public class Viva2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower limit of desired range: ");
		int lowerLimit = sc.nextInt();
		System.out.print("Enter upper limit of desired range: ");
		int upperLimit = sc.nextInt();
		System.out.printf("The prime numbers within the range [%d, %d] are: \n" + 
							Arrays.toString(generatePrimes(lowerLimit, upperLimit)), lowerLimit, upperLimit);
	}

	public static boolean isPrime(int a) {
		if (a < 2)
			return false;
		
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a%i==0)
				return false;
		}
		return true;
	}
	
//	PUT NEGATIVE VALUE, FOR Q1 MAKE IT ABLE TO OUTPUT DOUBLE VALUE AND CREATE A METHOD TO DO ALL PLUS MINUS MULTIPLICATION
//	public static ArrayList<Integer> generatePrimes(int a, int b) {
//		ArrayList<Integer> arrayPrime = new ArrayList<Integer>();
//		for (int i = a; i <= b; i++) {
//			if (isPrime(i))
//				arrayPrime.add(i);
//		}
//		return arrayPrime;
//	}
//}
	
	public static int[] generatePrimes(int a, int b) {
		int[] arrayPrime;
		int count = 0; 
		
		for (int i = a; i <= b; i++) {
			if (isPrime(i))
				count++;
		}
		
		arrayPrime = new int[count];
		int j = 0;
		for (int i = a; i <= b; i++) {
			if (isPrime(i)) {
				arrayPrime[j] = i;
				j++;
			}
		}
		return arrayPrime;
	}
}
