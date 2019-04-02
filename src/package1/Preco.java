package package1;

public abstract class Preco {
	private double quilo;
	private double arrouba;
	
	public Preco(Double quilo, Double arrouba) {
		this.quilo = quilo;
		this.arrouba = arrouba;
	}
	
	public Double getQuilo() {
		return quilo;		
	}
	public void setQuilo(Double quilo) {
		this.quilo = quilo;
	}
	public Double getArrouba() {
		return arrouba;
	}
	public void setArrouba(Double arrouba) {
		this.arrouba = arrouba;
	}

}
