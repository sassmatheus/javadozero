package ex05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		//Lembrando que, por definição, fatorial de 0 é 1.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um valor para calcular seu fatorial: ");
		int num = scan.nextInt();
		
		int fat = 1;
		for(int i = 1; i <= num; i++) {
			fat *= i;
		}
		System.out.print("Resultado: " + fat);
		
		scan.close();
	}
	
}
