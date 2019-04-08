package package1;

public abstract class CalcPreco {
	/**
	 * Construtor que determina a espécie do animal e a métrica de sua pesagem para o calculo do preço
	 * @param animal É a variável que especifica o animal que está sendo precificado
	 */
	public CalcPreco (Animal animal) {
		double peso = animal.getPeso();
		TipoAnimal tipo = animal.getTipo();
	}
	
	public double CalcPreco(double peso, TipoAnimal tipo) {
		return 0;
	}
}

