package Main;

import java.util.Locale;
import java.util.Scanner;
import Retangulo.Retangulo;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler os valores da largura e altura 
		//de um ret�ngulo. Em seguida, mostrar na tela o valor de 
		//sua �rea, per�metro e diagonal. Usar uma classe como 
		//mostrado no projeto ao lado
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("## Ret�ngulo ##");
		System.out.print("Insira a altura: ");
		retangulo.altura = scan.nextDouble();
		System.out.print("Insira a largura: ");
		retangulo.largura = scan.nextDouble();
		System.out.println();
		System.out.printf("Area: %.2f%n", retangulo.area());
		System.out.printf("Per�metro: %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());
		
		scan.close();
	}

}
