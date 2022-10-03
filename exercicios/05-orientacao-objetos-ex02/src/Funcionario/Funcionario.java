package Funcionario;

public class Funcionario {
	//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
	//seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
	//salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
	//afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
	//projetada abaixo.
	
	public String nome;
	public double bruto, imposto, aumento;
	
	public double calcLiquido() {
		return bruto - (bruto * imposto) / 100;
	}
	
	public double calcAumento() {
		return calcLiquido() + (calcLiquido() * aumento) / 100;
	}
	
}
