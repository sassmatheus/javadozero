package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um n�mero inteiro: ");
		int num = entrada.nextInt();
		
		if(num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("N�O NEGATIVO");
		}
		entrada.close();
	}

}
