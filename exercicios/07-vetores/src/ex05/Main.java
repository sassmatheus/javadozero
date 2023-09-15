package ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	//"maior posição"
	//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
	//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
	//considerando a primeira posição como 0 (zero). 

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números deseja inserir? ");
		int n = scan.nextInt();
		double[] vetor = new double[n];
		double maior = 0;
		int posicao = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Insira o %dº número: ", i + 1);
			vetor[i] = scan.nextDouble();
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.println();
		System.out.println("O maior número inserido é: " + maior);
		System.out.println("Sua posição no vetor é: " + posicao);
		
		scan.close();
	}

}
