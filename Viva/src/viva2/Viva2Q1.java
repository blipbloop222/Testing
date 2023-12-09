package viva2;
import java.util.*;

public class Viva2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] Arr1 = new int[3][3];
		int[][] Arr2 = new int[3][3];
		int[][] Arr3 = new int[3][3];
		
//		Taking array inputs
		System.out.println("Enter first integer array input in the order from up to down and from left to right. Press Enter after each input.");
		for (int i = 0; i < Arr1.length; i++) {
			for (int j = 0; j < Arr1[i].length; j++) {
				Arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter second integer array input in the order from up to down and from left to right. Press Enter after each input.");
		for (int i = 0; i < Arr2.length; i++) {
			for (int j = 0; j < Arr2[i].length; j++) {
				Arr2[i][j] = sc.nextInt();
			}
		}
		
//		Printing out arrays
		System.out.println("Your arrays are ");
		for (int i = 0; i < Arr1.length; i++) {
			for (int j = 0; j < Arr1[i].length; j++) {
				System.out.print(Arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("and");
		for (int i = 0; i < Arr2.length; i++) {
			for (int j = 0; j < Arr2[i].length; j++) {
				System.out.print(Arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The addition of the two arrays is "+Arrays.deepToString(addition(Arr1, Arr2)));
		System.out.println("The subtraction of the two arrays is "+Arrays.deepToString(subtraction(Arr1, Arr2)));
		System.out.println("The multiplication of the two arrays is "+Arrays.deepToString(multiplication(Arr1, Arr2)));
		
		System.out.println("Enter a 3x3 array input to find out its determinant and inverse");
		for (int i = 0; i < Arr3.length; i++) {
			for (int j = 0; j < Arr3[i].length; j++) {
				Arr3[i][j] = sc.nextInt();
			}
		}
		System.out.println("The determinant of the array is "+determinant(Arr3));
		System.out.println("The inverse of the array is "+Arrays.deepToString(inverse(Arr3)));
	}
	
	public static int[][] addition(int[][] Arr1, int[][] Arr2) {
		int[][] Arr3 = new int[3][3];
		
		for (int i = 0; i < Arr1.length; i++) {
			for (int j = 0; j < Arr1[i].length; j++) {
				Arr3[i][j] = Arr1[i][j] + Arr2[i][j];
			}
		}
		
		return Arr3;
	}
	
	public static int[][] subtraction(int[][] Arr1, int[][] Arr2) {
		int[][] Arr3 = new int[3][3];
		
		for (int i = 0; i < Arr1.length; i++) {
			for (int j = 0; j < Arr1[i].length; j++) {
				Arr3[i][j] = Arr1[i][j] - Arr2[i][j];
			}
		}
		
		return Arr3;
}
	
	public static int[][] multiplication(int[][] Arr1, int[][] Arr2) {
		int[][] Arr3 = new int[3][3];
		
		for (int i = 0; i < Arr1.length; i++) {
			for (int j = 0; j < Arr1[i].length; j++) {
				Arr3[i][j] = Arr1[i][j] * Arr2[i][j];
			}
		}
		
		return Arr3;
	}
	
	public static int minorDeterminant(int a, int b, int c, int d) {
		return a*d - b*c;
	}
	
//	adjugateMatrix == transposed cofactor matrix
	public static int determinant(int[][] arr) {
		
		int a = arr[0][0]; int b = arr[0][1]; int c = arr[0][2];
		int d = arr[1][0]; int e = arr[1][1]; int f = arr[1][2];
		int g = arr[2][0]; int h = arr[2][1]; int i = arr[2][2];
		
		int determinant = a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h -e*g);
		
		return determinant;
	}
	
	public static int[][] adjugateMatrix(int[][] Arr) {
		int[][] cofactor = new int[3][3];
		
		int a = Arr[0][0]; int b = Arr[0][1]; int c = Arr[0][2];
		int d = Arr[1][0]; int e = Arr[1][1]; int f = Arr[1][2];
		int g = Arr[2][0]; int h = Arr[2][1]; int i = Arr[2][2];
		
		cofactor[0][0] = e*i - f*h;
		cofactor[0][1] = d*i - f*g;
		cofactor[0][2] = d*h - e*g;
		cofactor[1][0] = b*i - c*h;
		cofactor[1][1] = a*i - c*g;
		cofactor[1][2] = a*h - b*g;
		cofactor[2][0] = b*f - c*e;
		cofactor[2][1] = a*f - c*d;
		cofactor[2][2] = a*e - b*d;
		
		cofactor[0][1] *= -1;
		cofactor[1][0] *= -1;
		cofactor[1][2] *= -1;
		cofactor[2][1] *= -1;
		
//		transposing the matrix
		int[][] adjugate = new int[3][3];
        for (int j = 0; j < cofactor.length; j++) {
            for (int k = 0; k < cofactor[j].length; k++) {
                adjugate[j][k] = cofactor[k][j];
            }
        }
        
		return adjugate;
	}

	public static int[][] inverse(int[][] arr) {
		int[][] inverse = new int[3][3];
		int[][] adjugate = adjugateMatrix(arr);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				inverse[i][j] = (1/determinant(arr)) * adjugate[i][j];
			}
		}
		return inverse;
		}
}