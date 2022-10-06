package ex02;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		//Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro 
		//casas decimais conforme exemplos. Considere o valor de pi = 3.14159
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double pi = 3.14159;
		double area, raio;
		
		System.out.println("Calcular raio: ");
		System.out.print("Insira o valor do raio do c�rculo: ");
		raio = scan.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("Area = %.4f", area);
		scan.close();
	}
}
