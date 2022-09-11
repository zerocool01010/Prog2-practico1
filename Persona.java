package ej1;
import java.time.Period;
import java.time.LocalDate;

public class Persona {
	//Attributes
	private String name; 
	private int age;
	private LocalDate date;
	private int DNI;
	private String sex;
	private int weight;
	private double height;

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
	//getters
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getSex() {
		return this.sex;
	}
	public LocalDate getDateBirth() {
		return this.date;
	}
	public int getWeight() {
		return this.weight;
	}
	public double getHeight() {
		return this.height;
	}
	
	//setters
	public void setName(String n) {
		this.name = n;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public void setSex(String s) {
		this.sex = s;
	}
	public void setDate(LocalDate d) {
		this.date = d;
	}
	public void setWeight(int w) {
		this.weight = w;
	}
	public void setHeight(double h) {
		this.height = h;
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
	public boolean getIsItBirthDay() {
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		if (month == 1 && day == 1) {
			return true;
		}
		return false;
	}
	public boolean getIsItOlderThan18() {
		if (this.age > 18) {
			return true;
		}
		return false;
	}
	public boolean getCanVote() {
		if (this.age > 16) {
			return true;
		}
		return false;
	}
	public boolean getCoherenceBetweenAgeAndDate() {
		LocalDate today = LocalDate.now();
		Period period = Period.between(this.date, today);
		int anios = period.getYears();
		System.out.println("los anios obtenidos son: "+anios);
		if (anios == this.age) {
			return true;
		}
		return false;
	}
	public String getObjectInfo() {
		String info = ("El nombre es: " + this.getName()
						+ "La edad es: " + this.getAge()
						+ "El sexo es: " + this.getSex()
						+ "La fecha de nacimiento es: " + this.getDateBirth()
						+ "Su peso es: " + this.getWeight()
						+ "Su altura es: " + this.getHeight()
				);
		return info;
	}
}
