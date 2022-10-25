package ex08;

import java.util.Scanner;

public class Main {
	//"media_pares
	//Fazer um programa para ler um vetor de N n�meros inteiros. Em seguida, mostrar na tela a m�dia 
	//aritm�tica somente dos n�meros pares lidos, com uma casa decimal. Se nenhum n�mero par for 
	//digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o tamanho do vetor: ");
		int N = scan.nextInt();
		int[] vetor = new int[N];
		int pares = 0;
		float media = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Insira o %d� n�mero: ", i + 1);
			vetor[i] = scan.nextInt();
			if(vetor[i] % 2 == 0) {
				pares++;
			}
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				media += vetor[i];
			}
		}
		media = media/pares;
		
		System.out.println();
		
		if(pares == 0) {
			System.out.println("Nenhum n�mero par.");
		} else {
			System.out.printf("A m�dia dos n�meros pares �: %.1f", media);
		}
		
		scan.close();
	}

}
