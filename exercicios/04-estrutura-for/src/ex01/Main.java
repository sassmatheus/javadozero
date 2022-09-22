package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
		//X, se for o caso.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro: ");
		int x = scan.nextInt();
		System.out.println("Lista de números ímpares até " + x + ": ");
		
		for(int i = 1; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
