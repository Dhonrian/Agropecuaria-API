package cadastro_animal;

import java.util.Date;

public class Suino extends Animal {
	public Suino(Double peso, String raca, String genero, Date nascimento, Long registro) {
		super(peso, raca, genero, nascimento, registro, TipoAnimal.SUINO);
	}
}
