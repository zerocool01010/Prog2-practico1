package ej1;

public class Persona {
	//Attributes
	private String name;
	private int age;
	//private dateType dateBirth;
	private int DNI;
	private String sex;
	private int weight;
	private int height;
	
	//constructor: it is a method with no return value and same name as the public class
	//in the constructor we assign default values to our private attributes of the class
	public Persona() {
		this.name = "N";
		this.age = 22;
		//this.dateBirth = 1st of January 2000;
		this.sex = "female";
		this.weight = 1;
		this.height = 1;
	}
	//can have other constructors expecting params to set one or more attribute private values
	public Persona(int DNI) {
		this.DNI = DNI; //Java knows how to diff between our DNI and the param DNI thanks to the .this
		this.name = "N";
		this.age = 22;
		//this.dateBirth = 1st of January 2000;
		this.sex = "female";
		this.weight = 1;
		this.height = 1;
	}
	//another constructor
	public Persona(int DNI, String name) {
		this.DNI = DNI;
		this.setName(name); //we can use our own methods in constructor to set values
		this.age = 22;
		//this.dateBirth = 1st of January 2000;
		this.sex = "female";
		this.weight = 1;
		this.height = 1;
	}
	
	//methods examples
	//set method: to change private attributes from outside
	public void setSex(String sexParam) {
		sex = sexParam;
	}
	public void setName(String name) {
		this.name = name; //with the "this" I make clear i am pointing to my private attribute
		//and not the one coming as parameter
	}
	//if I don't want an attribute to be changed from outside, then I dont create a setMethod
	//for that attribute
	
	//get method: to access or get the attribute value from outside
	public int getDni() {
		return DNI;
	}
	public int getBodyMassIndex() {
		return (this.weight / this.height*this.height);
	}
}
