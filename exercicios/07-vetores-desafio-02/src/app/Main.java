package app;

import java.util.Scanner;

import entities.Quartos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		Quartos[] vet = new Quartos[10];
		
		System.out.println("## SISTEMA DE ALUGUEL DE QUARTOS ##");
		System.out.print("Insira quantos quartos serão alugados: ");
		int qtd = scan.nextInt();
		
		for(int i = 1; i <= qtd; i++) {
			System.out.println("DADOS CADASTRAIS");
			System.out.println("Aluguel #" + i);
			System.out.print("Nome completo: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.next();
			System.out.print("Número do quarto a alugar: ");
			int numQuarto;
			do {
				numQuarto = scan.nextInt();
				if(numQuarto < 0 || numQuarto > 9) {
					System.out.print("ERRO!\n"
							+ "Insira um quarto válido: ");
				}
			} while (numQuarto < 0 || numQuarto > 9);
			
			Quartos quartos = new Quartos(nome, email);
			vet[numQuarto] = quartos;
		}
		
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] != null) {
				System.out.println(i + ": " + vet[i]);
			}
		}
		scan.close();
	}

}
