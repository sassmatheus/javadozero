package Main;

import java.util.Locale;
import java.util.Scanner;

import Funcionario.Funcionario;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em 
		//seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o 
		//sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto � 
		//afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe 
		//projetada abaixo.
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome do funcion�rio: ");
		funcionario.nome = scan.nextLine();
		System.out.print("Sal�rio bruto: ");
		funcionario.bruto = scan.nextDouble();
		System.out.print("Imposto (%): ");
		funcionario.imposto = scan.nextDouble();
		
		System.out.println();
		System.out.printf("Nome: %s%n"
						+ "Sal�rio l�quido: %.2f%n", funcionario.nome, funcionario.calcLiquido());
		
		System.out.println();
		System.out.print("Insira um aumento salarial (%): ");
		funcionario.aumento = scan.nextDouble();
		
		System.out.println();
		System.out.printf("Nome: %s%n"
				+ "Sal�rio l�quido: %.2f%n", funcionario.nome, funcionario.calcAumento());
		
		scan.close();
	}

}
