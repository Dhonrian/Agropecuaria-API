package package1;
import java.util.Date;

/**
 * Classe para o cadastro dos animais
 */

public abstract class Animal {

	 private Double peso;
	 private String genero;
	 private Date nascimento;
	 private Long registro;
	 private TipoAnimal tipo;
	 private CarteiraVacina carteira;
/**
 * Método construtor de animais.
 * @param peso Peso comercial do animal que pode ser registrado em Kilogramas ou Arrobas
 * @param genero Gênero do animal, podendo ser feminino ou masculino
 * @param nascimento Data de nascimento do animal
 * @param registro Número utilizado na identificação de cada um dos animais individualmente
 * @param tipo Registro da espécie do animal
 */
	 public Animal(Double peso, String raca, String genero, Date nascimento, Long registro, TipoAnimal tipo) {
		 this.peso = peso;
		 this.genero = genero;
		 this.nascimento = nascimento;
		 this.registro = registro;
		 this.tipo = tipo; 
		 this.inicializarAnimal();
		
	}
	 /**
	  * Método que define a espécie do animal registrado
	  */
	 private void inicializarAnimal() {
		if (this.tipo == TipoAnimal.BOVINO) {
			this.carteira = new CarteiraBovina();
		}
		else if (this.tipo == TipoAnimal.SUINO) {
			this.carteira = new CarteiraSuina();
		}
	}
	/**
	 * Método de controle da vacinação de cada animal
	 * @param tipoVacina Lista de possíveis vacinas do animal
	 * @param data Data da próxima vacina a ser tomada
	 */
	public void vacinar(TipoVacina tipoVacina, String data) {
		this.carteira.vacinar(tipoVacina, data);
	}
	
	public double getPesoEmArroba() {
		return peso / 30;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public long getRegistro() {
		return registro;
	}
	public void setRegistro(Long registro) {
		this.registro = registro;
	}
	public TipoAnimal getTipo() {
		return tipo;
	}
	public void setTipo(TipoAnimal tipo) {
		this.tipo = tipo;
	}
}
