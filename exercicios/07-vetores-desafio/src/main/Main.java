package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println();
			System.out.printf("Employee #%d:", i + 1);
			System.out.print("Id: ");
			int id = scan.nextInt();
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.printf("Salary: ");
			double salary = scan.nextDouble();
			
			Funcionario emp = new Funcionario(id, name, salary);
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idRaise = scan.nextInt();
		
		Funcionario emp = list.stream().filter(x -> x.getId() == idRaise).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = scan.nextDouble();
			//list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Funcionario e : list) {
			System.out.println(e);
		}		
		
		scan.close();
	}

	public static Integer position(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
