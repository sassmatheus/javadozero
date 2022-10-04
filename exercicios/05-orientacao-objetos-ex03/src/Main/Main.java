package Main;

import java.util.Locale;
import java.util.Scanner;

import Aluno.Aluno;

public class Main {
		/*
		Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
		(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
		ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
		para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
		resolver este problema.
		*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do aluno: ");
		aluno.nome = scan.nextLine();
		System.out.print("Nota 1º trimestre (0 - 30): ");
		aluno.tri1 = scan.nextDouble();
		System.out.print("Nota 2º trimestre (0 - 35): ");
		aluno.tri2 = scan.nextDouble();
		System.out.print("Nota 3º trimestre (0 - 35): ");
		aluno.tri3 = scan.nextDouble();
		
		System.out.printf("%n"
						+ "Média = %.2f%n"
						+ "%s%n", aluno.media(), aluno.conceito());
		
		
		scan.close();
	}
}
