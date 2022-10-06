package Aluno;

public class Aluno {
	/*
	Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano 
	(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
	ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam 
	para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para 
	resolver este problema.
	*/
	
	public String nome;
	public double tri1, tri2, tri3;
	
	public double media() {
		return tri1 + tri2 + tri3;
	}
	
	public String conceito() {
		if (media() < 60) {
			return "Reprovado\n"
					+ "Faltaram " + reprovado() + " pontos.";
		} else {
			return "Aprovado";
		}
	}
	
	public double reprovado() {
		return 60 - media();
	}
	
}
