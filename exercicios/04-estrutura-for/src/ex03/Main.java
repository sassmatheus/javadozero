package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
		//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
		//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
		//peso 5
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira quantos casos deseja calcular: ");
		int casos = scan.nextInt();
		
		for(int i = 1; i <= casos; i++) {
			System.out.println("Insira os 3 valores: ");
			double num1 = scan.nextDouble();
			double num2 = scan.nextDouble();
			double num3 = scan.nextDouble();
			
			double media = (num1 * 0.2 + num2 * 0.3 + num3 * 0.5);
			
			System.out.printf("Média: %.2f%n", media);
		}
		
		scan.close();
	}
}
