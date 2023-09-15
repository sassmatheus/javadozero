package ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		Scanner scan = new Scanner(System.in);
		
		int hInicial, hFinal, duracao;
		
		System.out.println("## Apenas números inteiros ##");
		System.out.print("Insira o horário inicial do jogo: ");
		hInicial = scan.nextInt();
		System.out.print("Insira o horário final do jogo: ");
		hFinal = scan.nextInt();
		
		if (hInicial < hFinal) {
			duracao = hFinal - hInicial;
		} else {
			duracao = 24 - hInicial + hFinal;
		}
		
		System.out.printf("O jogo durou %d horas.", duracao);
		
		scan.close();
	}
}
