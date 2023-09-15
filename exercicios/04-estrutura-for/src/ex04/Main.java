package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo 
		//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira quantas divis�es deseja fazer: ");
		int x = scan.nextInt();

		for(int i = 1; i <= x; i++) {
			System.out.print("\n"
							 + "Dividendo: ");
			double dividendo = scan.nextDouble();
			System.out.print("Divisor: ");
			double divisor = scan.nextDouble();
			
			if(divisor != 0) {
				System.out.println("Resultado: " + dividendo/divisor);
			} else {
				System.out.println("Divis�o imposs�vel.");
			}
		}

		scan.close();
	}
}
