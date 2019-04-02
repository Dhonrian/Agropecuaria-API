package package1;

import java.util.Date;

public abstract class CalcPreco_Bovino extends CalcPreco{

	public CalcPreco_Bovino(Animal animal) {
		super(animal);
	}

	private double preco_bovino = 20;
	
	@Override
	public double CalcPreco(double peso, double preco_bovino) {
		double preco = 0;
		preco = peso * preco_bovino;
		return preco;
	}
}
