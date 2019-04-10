package calculo_preco;

import cadastro_animal.Animal;

public abstract class CalcPreco_Suino extends CalcPreco{

	public CalcPreco_Suino(Animal animal) {
		super(animal);
		double preco_suino = 15;
	}
	
/**
 * Método para o calculo do preco do suino
 * @param peso Variável que armazena o peso na métrica já estipulada
 * @param preco_bovino Variável que armazena o preço atual do suino no mercado
 * @return Preço atualizado do suino segundo a métrica desejada
 */
	
	@Override
	public double CalcPreco(double peso, double preco_suino) {
		double preco = 0;
		preco = peso * preco_suino;
		return preco;
	}
}