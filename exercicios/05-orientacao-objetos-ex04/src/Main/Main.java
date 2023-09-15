package Main;

import java.util.Locale;
import java.util.Scanner;

import CurrencyConverter.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		//Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por 
		//uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda 
		//que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
		//para ser respons�vel pelos c�lculos.
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.println("Qual o pre�o do d�lar?");
		converter.dolar = scan.nextDouble();
		System.out.println("Quantos d�lares deseja comprar?");
		converter.reais = scan.nextDouble();
		
		System.out.printf("O valor pago em reais ser�: R$ %.2f", converter.conversor());
		
		scan.close();
	}

}
