package ej1;
import java.time.LocalDate;

public class Persona {
	//Attributes
	private String name; 
	private int age;
	private LocalDate date;
	private int DNI;
	private String sex;
	private int weight;
	public double height;

	// constructor
	public Persona() {
		this.name = "N N"; //we can use our own methods in constructor to set values
		this.age = 22;
		this.date = LocalDate.of(2000, 1, 1);
		this.sex = "female";
		this.weight = 78;
		this.height = 1.76;
	}
	//the other constructors
	public Persona (int DNI) {
		this(DNI, "N N");
	}
	public Persona(int DNI, String name) {
		this(DNI, name, LocalDate.of(2000, 1, 1));
	}
	public Persona(int DNI, String name, LocalDate dateBirth) {
		this.DNI = DNI;
		this.setName(name);
		this.date = dateBirth;
	}
	//setter
	public void setName(String n) {
		this.name = n;
	}
	
	//methods
	public double getBodyMassIndex() {
		double BMI = (this.weight / (this.height*this.height));
		return BMI;
	}
	
	public boolean getIsItInShape() {
		double BMI = this.getBodyMassIndex();
		if (BMI > 18.5 && BMI < 25) {
			return true;
		}
		return false;
	}
}
