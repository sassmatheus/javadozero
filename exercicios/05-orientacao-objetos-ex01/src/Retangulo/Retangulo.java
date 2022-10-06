package Retangulo;

public class Retangulo {
		//Fazer um programa para ler os valores da largura e altura 
		//de um retângulo. Em seguida, mostrar na tela o valor de 
		//sua área, perímetro e diagonal. Usar uma classe como 
		//mostrado no projeto ao lado
		
		public double largura;
		public double altura;
		
		public double area() {
			return largura * altura;
		}
		
		public double perimetro() {
			return (largura + altura) * 2;
		}
		
		public double diagonal() {
			return Math.sqrt((altura * altura) + (largura * largura));
		}
		
}
