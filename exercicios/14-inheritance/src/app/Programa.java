package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceirizado;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Insira o número de funcionários: ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println("Funcionário " + i + ": ");
			System.out.print("É tercerizado? (s/n): ");
			char ch = scan.next().charAt(0);
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Horas trabalhadas: ");
			int horas = scan.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora =  scan.nextDouble();
			
			if(ch == 's') {
				System.out.print("Taxa extra: ");
				double taxaExtra = scan.nextDouble();
				Funcionario func = new Terceirizado(nome, horas, valorPorHora, taxaExtra);
				lista.add(func);
			} else {
				Funcionario func = new Funcionario(nome, horas, valorPorHora);
				lista.add(func);
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		
		for (Funcionario func : lista) {
			System.out.println(func.getNome() + " - $ " + String.format("%.2f", func.pagamento()));
		}
		
		scan.close();
	}

}
