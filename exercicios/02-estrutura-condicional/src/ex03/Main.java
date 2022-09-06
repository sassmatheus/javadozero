package ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
		//ordem crescente ou decrescente.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("São múltiplos?");
		System.out.print("Insira o primeiro número: ");
		int numA = scan.nextInt();
		System.out.print("Insira o segundo número: ");
		int numB = scan.nextInt();
		
		if(numA % numB == 0 || numB % numA == 0) {
			System.out.printf("%d e %d são múltiplos!", numA, numB);
		} else {
			System.out.printf("%d e %d NÃO são múltiplos!", numA, numB);
		}
		
		scan.close();
	}
}
