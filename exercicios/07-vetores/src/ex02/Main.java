package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	//soma_vetor
	//Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em seguida: 
	//- Imprimir todos os elementos do vetor 
	//- Mostrar na tela a soma e a m�dia dos elementos do vetor 

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos n�meros deseja inserir?");
		int n = scan.nextInt();		
		double[] vetor = new double[n];
		double media = 0;
		double soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Insira o %d� n�mero: ", i+1);
			vetor[i] = scan.nextDouble();
			media += vetor[i]/vetor.length;
			soma += vetor[i];
		}
		System.out.println();
		System.out.print("Valores: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("%.2f; ", vetor[i]);
		}
		System.out.println();
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("M�dia: %.2f", media);
		
		
		scan.close();
	}
	
	
	
}
