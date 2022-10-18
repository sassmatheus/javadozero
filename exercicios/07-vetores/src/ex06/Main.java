package ex06;

import java.util.Scanner;

public class Main {
	//"soma_vetores"
	//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
	//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
	//o vetor C gerado. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira quantos elementos terão os vetores: ");
		int n = scan.nextInt();
		int[] vetorA = new int[n]; 
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		System.out.println("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf("%dº valor: ", i + 1);
			vetorA[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("Vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.printf("%dº valor: ", i + 1);
			vetorB[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("Vetor C (Soma dos elementos correspondentes): ");
		for(int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.print(vetorC[i] + " ");
		}
		
		scan.close();
	}

}
