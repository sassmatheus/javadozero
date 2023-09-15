package entidades;

public class Terceirizado extends Funcionario {

	private Double taxaExtra;
	
	public Terceirizado() {
		
	}

	public Terceirizado(String nome, Integer horas, Double valorPorHora, Double taxaExtra) {
		super(nome, horas, valorPorHora);
		this.taxaExtra = taxaExtra;
	}

	public Double getTaxaExtra() {
		return taxaExtra;
	}

	public void setTaxaExtra(Double taxaExtra) {
		this.taxaExtra = taxaExtra;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + (taxaExtra * 1.1);
	}
}
