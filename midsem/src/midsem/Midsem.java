package midsem;
import java.security.DomainCombiner;
import java.util.*;
import java.util.Random;

public class Midsem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random random = new Random();
//		Scanner sc = new Scanner(System.in);
//		int a; int b; int c;
//		int count;
//		
//		do {
//			int rand = random.nextInt();
//			a = rand;
//			rand = random.nextInt();
//			b = rand;
//			System.out.println("Enter negative value to quit");
//			System.out.print(a + " + " + b + " = ");
//			c = sc.nextInt();
//		} while (c>=0);
//		
//		System.out.println(count);
//	}
//
//	public static void Compare(int a, int b, int c) {
//		int count=0;
//		if (a*b==c) {
//			count++;
//		}
//	}
//}
	
		System.out.println(isPentagonal(12));
	}

	public static boolean isPentagonal(int num) {
		int Pn;
		for (int i=0; i<=num; i++) {
			Pn=i*(3*i-1) / 2;
			if (num==Pn) {
				return true;
			}
		}
		return false;
	}
}