package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
		//Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando 
		//essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		Scanner scan = new Scanner(System.in);
		int dentro = 0;
		int fora = 0;
		
		System.out.print("Insira quantos valores deseja inserir: ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Insira o %d� valor: ", i);
			int num = scan.nextInt();
			if(num >= 10 && num <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		System.out.println("\n"
				+ "Considerando o intervalo [10,20], h�:\n"
				+ dentro + " in\n"
				+ fora + " out");
		scan.close();
	}
}
