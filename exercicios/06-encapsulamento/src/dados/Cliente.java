package dados;

public class Cliente {
	private String nome;
	private int numConta;
	private double saldo;
	
	public Cliente(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
	}
	
	public Cliente(String nome, int numConta, double saldo) {
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Account " + getNumConta() + ", Holder: " + getNome() + ", Balance: $ " + String.format("%.2f", getSaldo());
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	public void saque(double saque) {
		saldo -= saque + 5;
	}
	
	
}
