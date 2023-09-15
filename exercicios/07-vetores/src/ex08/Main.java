package ex08;

import java.util.Scanner;

public class Main {
	//"media_pares
	//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
	//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
	//digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o tamanho do vetor: ");
		int N = scan.nextInt();
		int[] vetor = new int[N];
		int pares = 0;
		float media = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Insira o %dº número: ", i + 1);
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
			System.out.println("Nenhum número par.");
		} else {
			System.out.printf("A média dos números pares é: %.1f", media);
		}
		
		scan.close();
	}

}
