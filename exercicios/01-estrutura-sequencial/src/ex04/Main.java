package ex04;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por hora e
		//calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.
		Scanner scan = new Scanner(System.in);
		
		int numFunc;
		float horas, salario;
		
		System.out.print("Insira o n�mero do funcion�rio: ");
		numFunc = scan.nextInt();
		System.out.print("Insira o n�mero de horas trabalhadas no m�s: ");
		horas = scan.nextFloat();
		System.out.print("Insira o valor recebido por hora: ");
		salario = scan.nextFloat();
		
		System.out.printf("%nFuncion�rio n� %d%n"
				+ "Sal�rio: %.2f", numFunc, salario*horas);
		
	}

}
