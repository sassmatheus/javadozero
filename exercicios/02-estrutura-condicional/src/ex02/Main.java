package ex02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro: ");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("O número inserido é par.");
		} else {
			System.out.println("O número inserido é ímpar.");
		}
		scan.close();
	}
}
