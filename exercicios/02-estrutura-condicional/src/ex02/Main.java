package ex02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um n�mero inteiro: ");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("O n�mero inserido � par.");
		} else {
			System.out.println("O n�mero inserido � �mpar.");
		}
		scan.close();
	}
}
