package midsem;

import java.util.*;

public class Midsem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int rand = random.nextInt(13); int rand1 = random.nextInt(13);
		int a=rand; int b=rand1;
		Scanner sc = new Scanner(System.in);
		int result;
		do {
			System.out.println("Enter a negative number to quit: ");
			result = sc.nextInt();
			multiplicationGame(a, b, result);
		} while (result >= 0);
	}
	

	public static void multiplicationGame(int a, int b, int c) {
			System.out.println(a + " x " + b + " = ");
		}
	}



