package ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o 
		//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		Scanner scan = new Scanner(System.in);
		
		int codigo, num;
		float valor = 0;
		
		System.out.printf("Insira o c�digo da pe�a: ");
		codigo = scan.nextInt();
		System.out.printf("Insira o n�mero de pe�as: ");
		num = scan.nextInt();
		System.out.printf("Insira o valor unit�rio: ");
		valor += scan.nextFloat()*num;
		System.out.printf("Insira o c�digo da pe�a: ");
		codigo = scan.nextInt();
		System.out.printf("Insira o n�mero de pe�as: ");
		num = scan.nextInt();
		System.out.printf("Insira o valor unit�rio: ");
		valor += scan.nextFloat()*num;
		
		System.out.printf("%nValor a pagar: R$ %.2f", valor);
	}

}
