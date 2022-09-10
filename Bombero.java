package ej1;

public class Bombero {
	
	private String name;
	Persona bomb;
	
	public Bombero(String n, Persona person) {
		this.name = n;
		this.bomb = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Persona getBomb() {
		return bomb;
	}

	public void setBomb(Persona bomb) {
		this.bomb = bomb;
	}
	
}
