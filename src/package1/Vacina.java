package package1;

import java.sql.Date;

public class Vacina {
	private TipoVacina descricao;
	private Date dataQueTomou;
	private Date dataQueVaiTomar;
	
	public Vacina (TipoVacina descricao, Date dataQueTomou, Date dataQueVaiTomar){
		this.descricao = descricao;
		this.dataQueTomou = dataQueTomou;
		this.dataQueVaiTomar = dataQueVaiTomar;	
	}
		
	public TipoVacina getDescricao() {
		return descricao;
	}
	public void setDescricao(TipoVacina descricao) {
		this.descricao = descricao;
	}
	public Date getDataQueTomou() {
		return dataQueTomou;
	}
	public void setDataQueTomou(Date dataQueTomou) {
		this.dataQueTomou = dataQueTomou;
	}
	public Date getDataQueVaiTomar() {
		return dataQueVaiTomar;
	}
	public void setDataQueVaiTomar(Date dataQueVaiTomar) {
		this.dataQueVaiTomar = dataQueVaiTomar;
	}

}
