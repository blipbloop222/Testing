package viva2;

import java.util.*;

public class Viva2Q1extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] Arr = new int[3][3];
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {
				Arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(Arr));
		System.out.println(determinant(Arr));
		System.out.println(Arrays.deepToString(adjugateMatrix(Arr)));
		System.out.println(Arrays.deepToString(inverse(Arr)));
	}

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
