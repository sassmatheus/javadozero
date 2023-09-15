package app;

import java.util.Scanner;

//Fazer um programa para ler dois n�meros inteiros M e N, depois ler uma matriz de
//M linhas por N colunas contendo n�meros inteiros, podendo haver repeti��es.
//Em seguida, ler um n�mero inteiro X que pertence � matriz.
//Para cada ocorr�ncia de X, mostrar os valores � esquerda, acima, � direita e
//abaixo de X, quando houver.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("## Definir tamanho da matriz ##");
		System.out.print("Quantidade de linhas: ");
		int M = scan.nextInt();
		System.out.print("Quantidade de colunas: ");
		int N = scan.nextInt();
		
		int[][] matriz = new int[M][N];
		
		System.out.println("\n## Inser��o de dados ##");
		for(int l = 0; l < M; l++) {
			for(int c = 0; c < N; c++) {
				System.out.printf("Linha %d; Coluna %d: ", l+1, c+1);
				matriz[l][c] = scan.nextInt();
			}
		}
		
		System.out.println("\n## Matriz ##");
		for(int l = 0; l < M; l++) {
			for(int c = 0; c < N; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("\n## Verificar posi��o ##");
		
		boolean contem = false;
		do {
			System.out.print("Insira um n�mero da matriz: ");
			int verifica = scan.nextInt();
			for(int l = 0; l < M; l++) {
				for(int c = 0; c < N; c++) {
					if(matriz[l][c] == verifica) {
						contem = true;
						System.out.println("Valor encontrado! Posi��o: " + l + ", " + c);
							if(c > 0) {
								System.out.println("Esquerda: " + matriz[l][c-1]);
							}
							if(l > 0) {
								System.out.println("Cima: " + matriz[l-1][c]);
							}
							if(c < N-1) {
								System.out.println("Direita: " + matriz[l][c+1]);
							}
							if(l < M-1) {
								System.out.println("Baixo: " + matriz[l+1][c]);
							}
						}
					}
			}
			if(contem == false){
				System.out.println("Valor inv�lido!");
			}
		} while(contem == false);
		
		
		
		scan.close();
	}

}
