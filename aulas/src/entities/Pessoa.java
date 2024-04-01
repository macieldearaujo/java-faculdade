package entities;

public class Pessoa {

	private String name;
	private Double fortune;
	
	public Pessoa(String name, Double fortune) {
		this.name = name;
		this.fortune = fortune;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFortune() {
		return fortune;
	}
	
	public void monthlyEarnings(Double value) {
		fortune += value;
	}
}
