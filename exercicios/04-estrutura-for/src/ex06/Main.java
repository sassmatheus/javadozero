package ex06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Ler um número inteiro N e calcular todos os seus divisores

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		
		double num = scan.nextDouble();
		
		System.out.print("Divisores: 1");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0 && i != 1) {
				System.out.print(", " + i);
			}
		}
		scan.close();
	}
}
