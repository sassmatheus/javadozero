package Funcionario;

public class Funcionario {
	//Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em 
	//seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o 
	//sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto � 
	//afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe 
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
