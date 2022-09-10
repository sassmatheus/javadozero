package ex07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
		de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
		ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		Se o ponto estiver na origem, escreva a mensagem “Origem”.
		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
		situação */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("          |          \n"
					   + "    Q2    |    Q1    \n"
					   + "__________|__________\n"
					   + "          |          \n"
					   + "    Q3    |    Q4    \n"
					   + "          |          \n");
		System.out.print("Insira o valor de x: ");
		double x = scan.nextDouble();
		System.out.print("Insira o valor de y: ");
		double y = scan.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		} else if(x > 0 && y < 0) {
			System.out.println("Q4");
		} else if(x < 0 && y > 0) {
			System.out.println("Q2");
		} else if(x < 0 && y < 0) {
			System.out.println("Q3");
		} else if(x == 0 && y != 0) {
			System.out.println("Eixo Y");
		} else if(x != 0 && y == 0) {
			System.out.println("Eixo X");
		} else {
			System.out.println("Origem");
		}
		scan.close();
	}

}
