package calculo_preco;

import cadastro_animal.Animal;
import cadastro_animal.TipoAnimal;

public abstract class CalcPreco {
	
/**
 * Construtor que determina a espécie do animal e a métrica de sua pesagem para o calculo do preço
 * @param animal É a variável que especifica o animal que está sendo precificado
 */
	
	public CalcPreco (Animal animal) {
		double peso = animal.getPeso();
		TipoAnimal tipo = animal.getTipo();
	}

	public double CalcPreco(double peso, double preco_bovino) {
		return 0;
	}
}