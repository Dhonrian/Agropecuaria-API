package package1;

import java.util.ArrayList;
import java.util.List;

public class CarteiraSuina extends CarteiraVacina {
/**
 * Classe com as vacinas especificas para a espécie Suína
 */
	public CarteiraSuina() {
		super.vacinas = new ArrayList<Vacina>();
		super.vacinas.add(new Vacina(TipoVacina.COLIBACILOSE, null, null));
		super.vacinas.add(new Vacina(TipoVacina.DOENCA_DE_AUJESZKY, null, null));
		super.vacinas.add(new Vacina(TipoVacina.ERISIPELA, null, null));
		super.vacinas.add(new Vacina(TipoVacina.LEPTOSPIROSE, null, null));
		super.vacinas.add(new Vacina(TipoVacina.PARVOVIROSE, null, null));
		super.vacinas.add(new Vacina(TipoVacina.PESTE_SUINA_CLASSICA, null, null));
		super.vacinas.add(new Vacina(TipoVacina.PNEUMONIA_ENZOOTICA, null, null));
		super.vacinas.add(new Vacina(TipoVacina.RINITE_ATROFICA, null, null));
	}

}
