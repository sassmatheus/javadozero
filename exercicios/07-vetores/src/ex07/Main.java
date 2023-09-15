package ex07;

import java.util.Scanner;

public class Main {
	//"abaixo_da_media"
	//Fazer um programa para ler um n�mero inteiro N e depois um vetor de N n�meros reais. Em seguida, 
	//mostrar na tela a m�dia aritm�tica de todos elementos com tr�s casas decimais. Depois mostrar todos 
	//os elementos do vetor que estejam abaixo da m�dia, com uma casa decimal cada. 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o tamanho do vetor: ");
		int N = scan.nextInt();
		int[] vetor = new int[N];
		double media = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Insira o %d� valor: ", i+1);
			vetor[i] = scan.nextInt();
			media += (double)vetor[i] / N; //casting double 'cause 'vetor' is an int type
		}
		
		System.out.println("M�dia: " + media);
		System.out.println("Elementos abaixo da m�dia: ");
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		scan.close();
	}

}
