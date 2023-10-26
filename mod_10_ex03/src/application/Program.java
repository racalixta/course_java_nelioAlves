package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas e colunas da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < n; k++) {
				System.out.printf("Digite um número para a posição %d, %d: ", i, k);
				mat[i][k] = sc.nextInt();
			}
		}
		
		System.out.println();
		showMatriz(mat);
		
		System.out.print("\nMain Diagonal: ");
		mainDiagonal(mat);
		
		System.out.println("\nNegative Numbers: " + negative(mat));
		
		
		sc.close();
	}
	
	public static void showMatriz(int[][] mat) {
		for(int i = 0; i < mat.length; i++) {
			for(int k = 0; k < mat[i].length; k++) {
				if(k == (mat[i].length - 1)) {
					System.out.println(mat[i][k]);
				} else {
					System.out.print(mat[i][k] + ", ");
				}
				
			}
		}
	}
	
	public static void mainDiagonal(int[][] mat) {
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
			
		}
	}
	
	public static int negative(int[][] mat) {
		int count = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int k = 0; k < mat[i].length; k++) {
				if(mat[i][k] < 0) {
					count += 1;
				}
				
			}
		}
		
		return count;
	}

}
