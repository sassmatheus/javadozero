package ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		Scanner scan = new Scanner(System.in);
		
		int codigo, num;
		float valor = 0;
		
		System.out.printf("Insira o código da peça: ");
		codigo = scan.nextInt();
		System.out.printf("Insira o número de peças: ");
		num = scan.nextInt();
		System.out.printf("Insira o valor unitário: ");
		valor += scan.nextFloat()*num;
		System.out.printf("Insira o código da peça: ");
		codigo = scan.nextInt();
		System.out.printf("Insira o número de peças: ");
		num = scan.nextInt();
		System.out.printf("Insira o valor unitário: ");
		valor += scan.nextFloat()*num;
		
		System.out.printf("%nValor a pagar: R$ %.2f", valor);
	}

}
