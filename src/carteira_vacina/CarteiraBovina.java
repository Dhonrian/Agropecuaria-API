package carteira_vacina;

import java.util.ArrayList;
import java.util.List;

public class CarteiraBovina extends CarteiraVacina{
	
/**
 * Classe com as vacinas especificas para a espécie Bovina
 */
	
	public CarteiraBovina() {
		super.vacinas = new ArrayList<Vacina>();
		super.vacinas.add(new Vacina(TipoVacina.FEBRE_AFTOSA, null, null));
		super.vacinas.add(new Vacina(TipoVacina.CLOSTRIDIOSES, null, null));
		super.vacinas.add(new Vacina(TipoVacina.BOTULISMO, null, null));
		super.vacinas.add(new Vacina(TipoVacina.LEPTOSPIROSE, null, null));
		super.vacinas.add(new Vacina(TipoVacina.RAIVA, null, null));
		super.vacinas.add(new Vacina(TipoVacina.BRUCELOSE, null, null));
		super.vacinas.add(new Vacina(TipoVacina.IBR, null, null));
	}

	public List<Vacina> getVacinas() {
		return vacinas;
	}

	public void setVacinas(List<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
}
