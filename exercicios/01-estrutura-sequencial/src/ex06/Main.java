package ex06;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e 
		//mostre: 
		//a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. 
		//b) a �rea do c�rculo de raio C. (pi = 3.14159) 
		//c) a �rea do trap�zio que tem A e B por bases e C por altura. 
		//d) a �rea do quadrado que tem lado B. 
		//e) a �rea do ret�ngulo que tem lados A e B.
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Double a, b, c;
		
		System.out.print("Insira o valor de A: ");
		a = scan.nextDouble();
		System.out.print("Insira o valor de B: ");
		b = scan.nextDouble();
		System.out.print("Insira o valor de C: ");
		c = scan.nextDouble();
		
		System.out.printf("\nTRI�NGULO: %.3f%n", a*c/2);
		System.out.printf("C�RCULO: %.3f%n", 3.14159*c*c);
		System.out.printf("TRAP�ZIO: %.3f%n", (a+b)/2*c);
		System.out.printf("QUADRADO: %.3f%n", b*b);
		System.out.printf("RET�NGULO: %.3f%n", a*b);
	}

}
