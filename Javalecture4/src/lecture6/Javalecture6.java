package lecture6;

import java.util.*;

public class Javalecture6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i=1; i<=10; i++) {
//			int squared = (int) Square(i);
//			System.out.print(squared + " ");
//		}
//		
//		Square1(2, 10);
//	}
//		randomnumber(5, 10, 100);
//	}
//		System.out.println("The perimeter of rectangle is: " + perimeterRectangle(5, 10) + 
//							"\nThe perimeter of circle is: " + perimeterCircle(5));
//	}
//
//	public static double Square(int num) {
//		double num2 = Math.pow(num, 2);
//		return num2;
//		
//	}
//	
//	public static void Square1(int num, int num2) {
//		for (int i=num; i<=num2; i++) {
//			System.out.print(i*i + " ");
//		}
//	}
		
//	public static void randomnumber(int n, int a, int b) {
//		Random random = new Random();
//		int rand;
//		
//		for (int i=1; i<=n; i++) {
//			rand = random.nextInt(a, b+1);
//			System.out.print(rand + " ");
//		}
//	}
//	
//	public static int perimeterRectangle(int a, int b) {
//		return 2*a + 2*b;
//	}
//	
//	public static double perimeterCircle(int r) {
//		return 2*Math.PI*r;
//	}
		int[] Arr = new int[10];
		getOdd(Arr, 10, 100);
		
}
	public static int getOdd(int[] num, int A, int B) {
		Random random = new Random();
		int count=0;
		
		for(int i=0; i<num.length; i++) {
			int rand = random.nextInt(A, B+1);
			num[i]=rand;
			
			if (num[i]%2 != 0) {
				System.out.print(num[i] + " ");
				count++;
			}
		}
		return count;
	}
}
