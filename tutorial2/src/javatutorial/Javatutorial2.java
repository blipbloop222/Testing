package javatutorial;

import java.util.Random;
import java.util.Scanner;

public class Javatutorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a negative value to quit the program");
		System.out.print("Enter an exam score: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int avg = 0;
        
		while (n >= 0) {
			System.out.print("Enter an exam score: ");
			n = sc.nextInt();
			if (n > max && n>=0) {
				max = n;
			}
			if (n < min && n>=0) {
				min = n;
			}
			sum += n;
		}
        System.out.println("Minimum score is: " + min + "\nMaximum score is: " + max + 
        					"\nSum of the score is: " + sum);
		}
	
	}


