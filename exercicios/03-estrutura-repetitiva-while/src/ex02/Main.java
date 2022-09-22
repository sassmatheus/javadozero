package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double x, y;
		
		do {
			System.out.print("Coordenada X: ");
			x = scan.nextDouble();
			System.out.print("Coordenada Y: ");
			y = scan.nextDouble();
			if(x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			} else if(x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
			} else if(x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			} else if(x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			} 
		} while (x != 0 && y != 0);
		
		scan.close();
	}

}
