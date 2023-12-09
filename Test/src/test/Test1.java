package test;
import java.util.*;

public class Test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an even integer: ");
		Scanner sc = new Scanner(System.in);
		int even = sc.nextInt();
		int primeA = 0;
		int primeB = 0;
		
		while (even%2!=0) {
			System.out.print("Please input an even integer: ");
			even=sc.nextInt();
		}
		
		if (even>2 && even%2==0) {
			System.out.print("The prime numbers are: ");
			for (int i=0; i<=even; i++) {
				if (isPrime(i)) {
					primeA = i;
					primeB = even-primeA;
					if (isPrime(primeB) && isPrime(primeA)) {
						System.out.println(primeA + " and " + primeB);
					}
			}
		}
	}		
		else {
			System.out.println("Goldbach's Conjecture is not satisfied for the given input");
		}
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if (num<2) {
			return false;
		}
		for (int i=2; i<=Math.sqrt(num); i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
}




