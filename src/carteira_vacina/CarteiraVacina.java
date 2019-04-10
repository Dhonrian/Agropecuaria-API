package carteira_vacina;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public abstract class CarteiraVacina {
	List<Vacina> vacinas;
	
/**
 * Método de verificação das vacinas dos animais.
 * Caso o registro do animal apresente algum campo do TipoVacina sem uma data
 * esse campo será armazenado na variável "data" com o dia presente para que
 * seja feita a vacinação do animal. 
 * @param tipoDeVacina Lista as vacinas que o animal necessita
 * @param data Registra a data da próxima vacinação
 */
	
	public void vacinar(TipoVacina tipoDeVacina, String data) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		for (Vacina vacina : vacinas) {
			if	(tipoDeVacina == vacina.getDescricao()) {
				if (data == null) {
					vacina.setDataQueTomou(new Date());
				}
				else {
					Date date;
					try {
						date = format.parse(data);
						vacina.setDataQueTomou(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}    
				}
			}
		}
	}
}

