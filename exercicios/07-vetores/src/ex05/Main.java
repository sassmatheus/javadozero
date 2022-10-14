package ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	//"maior posi��o"
	//Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em seguida, mostrar na tela 
	//o maior n�mero do vetor (supor n�o haver empates). Mostrar tamb�m a posi��o do maior elemento, 
	//considerando a primeira posi��o como 0 (zero). 

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos n�meros deseja inserir? ");
		int n = scan.nextInt();
		double[] vetor = new double[n];
		double maior = 0;
		int posicao = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Insira o %d� n�mero: ", i + 1);
			vetor[i] = scan.nextDouble();
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.println();
		System.out.println("O maior n�mero inserido �: " + maior);
		System.out.println("Sua posi��o no vetor �: " + posicao);
		
		scan.close();
	}

}
