package ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d, resultado;
		
		System.out.print("Insira o valor de A: ");
		a = scan.nextInt();
		System.out.print("Insira o valor de B: ");
		b = scan.nextInt();
		System.out.print("Insira o valor de C: ");
		c = scan.nextInt();
		System.out.print("Insira o valor de D: ");
		d = scan.nextInt(); 
		resultado = a * b - c * d;
		System.out.println("(A * B) - (C * D) = " + resultado);
		
	}

}
