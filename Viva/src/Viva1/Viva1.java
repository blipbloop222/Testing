package Viva1;

import java.util.*;

public class Viva1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50;
		int newNum = 0;
		while (num>0) {
			int digit = num%10;
			newNum = newNum*10 + digit;
			num/=10;
		}
		System.out.println(newNum);
}
	
//	a>=b, post-condition: Greatest Common Divisor
	public static int GCD (int a, int b) {
		while (b!=0) {
			int remainder;
			remainder = a%b;
			a=b;
			b=remainder;
		}
		return a;
	}
}


