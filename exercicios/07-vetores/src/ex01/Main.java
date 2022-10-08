package ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//"Negativos"
		//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
		//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int N;
		do {
			System.out.println("Quantos números deseja inserir? (1-10)");
			N = scan.nextInt();
		} while(N < 1 || N > 10);
		
		int[] vetor = new int[N];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Insira o %dº número: ", i+1);
			vetor[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("Números negativos: ");
		boolean negativos = false;
		for(int i = 0; i < vetor.length; i++) {	
			if(vetor[i] < 0) {
				negativos = true;
				System.out.println(vetor[i]);				
			}		
		}
		if(negativos == false) {
			System.out.println("Nenhum número negativo foi inserido.");
		}
		scan.close();
	}

}
