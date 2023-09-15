package ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		//Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em 
		//ordem crescente ou decrescente.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("S�o m�ltiplos?");
		System.out.print("Insira o primeiro n�mero: ");
		int numA = scan.nextInt();
		System.out.print("Insira o segundo n�mero: ");
		int numB = scan.nextInt();
		
		if(numA % numB == 0 || numB % numA == 0) {
			System.out.printf("%d e %d s�o m�ltiplos!", numA, numB);
		} else {
			System.out.printf("%d e %d N�O s�o m�ltiplos!", numA, numB);
		}
		
		scan.close();
	}
}
