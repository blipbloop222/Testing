package javatutorial;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = ("UM");
//		String s2 = ("um");
//		
//		if (s1.equalsIgnoreCase(s2)) System.out.println("It is the same");
//		else System.out.println("It is not the same");
		
		Random random = new Random();
		int num;
		int MAX = 100;
		num = random.nextInt(MAX);
		
		switch (num){
		case 1:
			System.out.println("Draw Pie Chart");
		break;
			
		case 2:
			System.out.println("Draw Line Chart");
		break;
			
		case 3:
			System.out.println("Draw Bar Chart");
		break;
			
		default:
			System.out.println("Invalid Choice");
			
		}		
	}
}
