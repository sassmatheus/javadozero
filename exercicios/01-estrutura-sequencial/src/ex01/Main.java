package ex01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, soma;
		
		System.out.println("SOMA");
		System.out.print("Insira o primeiro número: ");
		num1 = scan.nextInt();
		System.out.print("Insira o segundo número: ");
		num2 = scan.nextInt();
		soma = num1 + num2;	
		System.out.println("Resultado: " + soma);	
		
		scan.close();
	}
}
