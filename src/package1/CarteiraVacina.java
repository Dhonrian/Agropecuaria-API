package package1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public abstract class CarteiraVacina {
	List<Vacina> vacinas;
	
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
						// TODO Auto-generated catch block
						e.printStackTrace();
					}    
				}
			}
		}
	}

}

