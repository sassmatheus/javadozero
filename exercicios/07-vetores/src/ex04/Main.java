package ex04;

import java.util.Scanner;

public class Main {
	
	//"numeros pares"
	//Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. Em seguida, mostre na 
	//tela todos os n�meros pares, e tamb�m a quantidade de n�meros pares. 

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira quantos n�meros inteiros deseja checar: ");
		int N = scan.nextInt();
		
		int[] vetor = new int[N];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Insira o %d� n�mero: ", i + 1);
			vetor[i] = scan.nextInt();
		}
		
		int pares = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + "; ");
				pares++;
			}
		}
		
		System.out.println();
		System.out.println("Total de n�meros pares: " + pares);
		
		scan.close();
	}

}
