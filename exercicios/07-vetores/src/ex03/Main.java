package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	//"alturas"
	//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
	//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
	//bem como os nomes dessas pessoas caso houver. 

	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira quantas pessoas deseja cadastrar: ");
		int n = scan.nextInt();
		Pessoa[] vetorPessoa = new Pessoa[n];
		String nome;
		int idade;
		double altura;
		
		for(int i = 0; i < vetorPessoa.length; i++) {
			System.out.printf("%dª pessoa %n", i + 1);
			System.out.print("Nome: ");
			scan.nextLine();
			nome = scan.nextLine();
			System.out.print("Idade: ");
			idade = scan.nextInt();
			System.out.print("Altura: ");
			altura = scan.nextDouble();
			vetorPessoa[i] = new Pessoa(nome, idade, altura);
		}
		
		System.out.println("\nPessoas: ");
		for(int i = 0; i < vetorPessoa.length; i ++) {
			System.out.println(vetorPessoa[i].toString());
		}
		
		double alturaMedia = 0;
		double menor16 = 0;
		for(int i = 0; i < vetorPessoa.length; i++) {
			alturaMedia += vetorPessoa[i].getAltura() / vetorPessoa.length;
			if(vetorPessoa[i].getIdade() < 16) {
				menor16++;
			}
		}
		double sub16 = (menor16 * 100) / vetorPessoa.length;
		
		System.out.println("Altura média: " + alturaMedia);
		System.out.printf("Pessoa com menos de 16 anos: %.2f%%", sub16);
		System.out.println();
		for(int i = 0; i < vetorPessoa.length; i++) {
			if(vetorPessoa[i].getIdade() < 16) {
				System.out.println(vetorPessoa[i].getNome());
			}
		}
		
		scan.close();
	}

}
