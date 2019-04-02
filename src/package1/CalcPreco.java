package package1;

public abstract class CalcPreco {
	
	public CalcPreco (Animal animal) {
		double peso = animal.getPeso();
		TipoAnimal tipo = animal.getTipo();
	}
	
	public double CalcPreco(double peso, TipoAnimal tipo) {
		return 0;
	}
}

