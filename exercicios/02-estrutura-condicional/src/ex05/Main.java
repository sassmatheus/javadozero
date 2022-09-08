package ex05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cod;
		System.out.print(  "Código | Especificação   | Preço\n"
						+  "   1   | Cachorro Quente | R$ 4.00\n"
						+  "   2   | X-Salada        | R$ 4.50\n"
						+  "   3   | X-Bacon         | R$ 5.50\n"
						+  "   4   | Torrada Simples | R$ 2.00\n"
						+  "   5   | Refrigerante    | R$ 1.50\n\n");
		do {
			System.out.print("Insira o código do produto: ");
			cod = scan.nextInt();
			if (cod < 1 || cod > 5) {
				System.out.println("Código inválido!");
			}
		} while (cod < 1 || cod > 5);
		
		System.out.print("Insira a quantidade desejada: ");
		int qnt = scan.nextInt();
		double total = 0;
		
		if(cod == 1) {
			total = 4 * qnt;
		} else if (cod == 2) {
			total = 4.5 * qnt;
		} else if (cod == 3) {
			total = 5.5 * qnt;
		} else if (cod == 4) {
			total = 2 * qnt;
		} else {
			total = 1.5 * qnt;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		scan.close();
	}
}
