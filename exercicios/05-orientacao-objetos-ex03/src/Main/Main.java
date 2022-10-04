package Main;

import java.util.Locale;
import java.util.Scanner;

import Aluno.Aluno;

public class Main {
		/*
		Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano 
		(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
		ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam 
		para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para 
		resolver este problema.
		*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do aluno: ");
		aluno.nome = scan.nextLine();
		System.out.print("Nota 1� trimestre (0 - 30): ");
		aluno.tri1 = scan.nextDouble();
		System.out.print("Nota 2� trimestre (0 - 35): ");
		aluno.tri2 = scan.nextDouble();
		System.out.print("Nota 3� trimestre (0 - 35): ");
		aluno.tri3 = scan.nextDouble();
		
		System.out.printf("%n"
						+ "M�dia = %.2f%n"
						+ "%s%n", aluno.media(), aluno.conceito());
		
		
		scan.close();
	}
}
