package ex02;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
		//casas decimais conforme exemplos. Considere o valor de pi = 3.14159
		Scanner scan = new Scanner(System.in);
		
		double pi = 3.14159;
		double area, raio;
		
		System.out.println("Calcular raio: ");
		System.out.print("Insira o valor do raio do círculo: ");
		raio = scan.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("Area = %.4f", area);
	}
}
