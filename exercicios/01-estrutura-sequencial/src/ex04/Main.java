package ex04;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e
		//calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		Scanner scan = new Scanner(System.in);
		
		int numFunc;
		float horas, salario;
		
		System.out.print("Insira o número do funcionário: ");
		numFunc = scan.nextInt();
		System.out.print("Insira o número de horas trabalhadas no mês: ");
		horas = scan.nextFloat();
		System.out.print("Insira o valor recebido por hora: ");
		salario = scan.nextFloat();
		
		System.out.printf("%nFuncionário nº %d%n"
				+ "Salário: %.2f", numFunc, salario*horas);
		
	}

}
