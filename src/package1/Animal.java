package package1;
import java.util.Date;

public abstract class Animal {
	 
	 private Double peso;
	 private String raca;
	 private String genero;
	 private Date nascimento;
	 private Long registro;
	 private TipoAnimal tipo;
	 private CarteiraVacina carteira;
	 
	 private final double PRECO_KG_BOVINO = 20.0;
	 private final double PRECO_KG_SUINO = 15.0;
	 
	 public Animal(Double peso, String raca, String genero, Date nascimento, Long registro, TipoAnimal tipo) {
		 this.peso = peso;
		 this.raca = raca;
		 this.genero = genero;
		 this.nascimento = nascimento;
		 this.registro = registro;
		 this.tipo = tipo; 
		 this.inicializarAnimal();
	}
	 
	private void inicializarAnimal() {
		if (this.tipo == TipoAnimal.BOVINO) {
			this.carteira = new CarteiraBovina();
		}
		else if (this.tipo == TipoAnimal.SUINO) {
			this.carteira = new CarteiraSuina();
		}
	}
	
	public void vacinar(TipoVacina tipoVacina, String data) {
		this.carteira.vacinar(tipoVacina, data);
	}

	public void vacinar(TipoVacina tipoVacina, Date data) {
		
	}
	
	public double obterPreco() {
		double preco = 0;
		if (this.tipo == TipoAnimal.BOVINO) {
			preco = this.PRECO_KG_BOVINO * this.peso;
		}
		else if (this.tipo == TipoAnimal.SUINO) {
			preco = this.PRECO_KG_SUINO * this.peso;
		}
		return preco;
	}
	
	public double getPesoEmArroba() {
		return peso / 15;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
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
