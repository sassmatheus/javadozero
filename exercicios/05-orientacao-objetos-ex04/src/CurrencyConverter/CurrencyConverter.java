package CurrencyConverter;

public class CurrencyConverter {

	public static double IOF = 6;
	public double reais, dolar;
	
	public double conversor() {
		return dolar * reais * (1 + IOF / 100);
	}
}
