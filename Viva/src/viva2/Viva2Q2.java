package viva2;

import java.util.Scanner;

public class Viva2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPalindrome()) {
			System.out.println("Your sentence is a palindrome!");
		}
		else {
			System.out.println("Your sentence is not a palindrome");
		}
	}

	public static String removeSpecialCharacters() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		String newStr = str; 
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || 
				str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				
			}
			else {
				String strChar = Character.toString(str.charAt(i));
				newStr = newStr.replace(strChar, "");
			}
		}
		return newStr;
	}
	
	public static boolean isPalindrome() {
		String str = removeSpecialCharacters();
		System.out.println("Reversed string: " + str);
		for (int i = 0, j = str.length() - 1; i < str.length() && j >= 0; i++, j--) {
			if (str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
	}
}
