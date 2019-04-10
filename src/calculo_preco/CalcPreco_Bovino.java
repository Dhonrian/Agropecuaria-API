package calculo_preco;

import cadastro_animal.Animal;

public abstract class CalcPreco_Bovino extends CalcPreco{

	public CalcPreco_Bovino(Animal animal) {
		super(animal);
		double preco_bovino = 20;
	}
	
/**
 * Método para o calculo do preco do bovino
 * @param peso Variável que armazena o peso na métrica já estipulada
 * @param preco_bovino Variável que armazena o preço atual do bovino no mercado
 * @return Preço atualizado do bovino segundo a métrica desejada
 */
	
	@Override
	public double CalcPreco(double peso, double preco_bovino) {
		double preco = 0;
		preco = peso * preco_bovino;
		return preco;
	}
}