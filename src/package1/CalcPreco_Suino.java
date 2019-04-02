package package1;

import java.util.Date;

public abstract class CalcPreco_Suino extends CalcPreco{

	public CalcPreco_Suino(Animal animal) {
		super(animal);
	}

	private double preco_suino = 15;
	
	@Override
	public double CalcPreco(double peso, double preco_suino) {
		double preco = 0;
		preco = peso * preco_suino;
		return preco;
	}
}
