package ex06;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
		//mostre: 
		//a) a área do triângulo retângulo que tem A por base e C por altura. 
		//b) a área do círculo de raio C. (pi = 3.14159) 
		//c) a área do trapézio que tem A e B por bases e C por altura. 
		//d) a área do quadrado que tem lado B. 
		//e) a área do retângulo que tem lados A e B.
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Double a, b, c;
		
		System.out.print("Insira o valor de A: ");
		a = scan.nextDouble();
		System.out.print("Insira o valor de B: ");
		b = scan.nextDouble();
		System.out.print("Insira o valor de C: ");
		c = scan.nextDouble();
		
		System.out.printf("\nTRIÂNGULO: %.3f%n", a*c/2);
		System.out.printf("CÍRCULO: %.3f%n", 3.14159*c*c);
		System.out.printf("TRAPÉZIO: %.3f%n", (a+b)/2*c);
		System.out.printf("QUADRADO: %.3f%n", b*b);
		System.out.printf("RETÂNGULO: %.3f%n", a*b);
	}

}
