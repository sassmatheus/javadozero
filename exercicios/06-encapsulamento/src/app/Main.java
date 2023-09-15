package app;

import java.util.Locale;
import java.util.Scanner;
import dados.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int numConta = scan.nextInt();
		System.out.print("Enter account holder: ");
		scan.nextLine();
		String nome = scan.nextLine();
		
		Cliente cliente;
		
		System.out.print("Is there an initial deposit? (y/n): ");
		
		
		String inicial = scan.next();
		if(inicial.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double saldo = scan.nextDouble();
			cliente = new Cliente(nome, numConta, saldo);
		} else {
			cliente = new Cliente(nome, numConta);
		}
		
		
		
		System.out.println();
		System.out.println("Account data:\n" + cliente.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = scan.nextDouble();
		cliente.deposito(deposito);

		System.out.println();
		System.out.println("Updated data:\n" + cliente.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = scan.nextDouble();
		cliente.saque(saque);
		
		System.out.println();
		System.out.println("\nUpdated date:\n" + cliente.toString());
		
		scan.close();
	}

}
