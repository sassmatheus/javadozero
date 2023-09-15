package Main;

import java.util.Locale;
import java.util.Scanner;

import Funcionario.Funcionario;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
		//seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
		//salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
		//afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
		//projetada abaixo.
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome do funcionário: ");
		funcionario.nome = scan.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.bruto = scan.nextDouble();
		System.out.print("Imposto (%): ");
		funcionario.imposto = scan.nextDouble();
		
		System.out.println();
		System.out.printf("Nome: %s%n"
						+ "Salário líquido: %.2f%n", funcionario.nome, funcionario.calcLiquido());
		
		System.out.println();
		System.out.print("Insira um aumento salarial (%): ");
		funcionario.aumento = scan.nextDouble();
		
		System.out.println();
		System.out.printf("Nome: %s%n"
				+ "Salário líquido: %.2f%n", funcionario.nome, funcionario.calcAumento());
		
		scan.close();
	}

}
