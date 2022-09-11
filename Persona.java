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
	public int height;

	// constructor
	public Persona() {
		this.name = "N N"; //we can use our own methods in constructor to set values
		this.age = 22;
		this.date = LocalDate.of(2000, 1, 1);
		this.sex = "female";
		this.weight = 1;
		this.height = 1;
	}
	//the other constructors
	public Persona (int DNI) {
		this.DNI = DNI;
	}
	public Persona(int DNI, String name) {
		this.DNI = DNI;
		this.setName(name);
	}
	public Persona(int DNI, String name, LocalDate dateBirth) {
		this.DNI = DNI;
		this.setName(name);
		this.date = dateBirth;
	}
	
	//methods
	public void setSex(String sexParam) {
		sex = sexParam;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//get method: to access or get the attribute value from outside
	public String getName() {
		return this.name;
	}
	public int getBodyMassIndex() {
		return (this.weight / this.height*this.height);
	}
}
