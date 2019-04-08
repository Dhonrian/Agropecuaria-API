package package1;

import java.util.Date;

public class Bovino extends Animal {
	public Bovino(Double peso, String raca, String genero, Date nascimento, Long registro) {
		super(peso, raca, genero, nascimento, registro, TipoAnimal.BOVINO);
	}
}
