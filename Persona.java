package ej1;

public class Persona {
	//Attributes
	private String name; //private can´t be "seen" from outside the class, while the public can be "seen" from outside
	private int age;
	//private dateType dateBirth;
	private int DNI;
	private String sex;
	private int weight;
	public int height;
	
	Bombero bomber;
	
	//constructor: it is a method with no return value and same name as the public class
	//in the constructor we assign default values to our private attributes of the class
	//public Persona() {
		//this.name = "N";
		//this.age = 22;
		//this.dateBirth = 1st of January 2000;
		//this.sex = "female";
		//this.weight = 1;
		//this.height = 1;
	//}
	//can have other constructors expecting params to set one or more attribute private values
	public Persona() {
		this(37766544, "N", 22, "female", 1, 1); //when passing parameters like this, we are reutilizing another constructor
		//in order to build this constructor, which constructor we are using as base? The only one that is expection 6 args
		//in order to be completed. So we replaced all the manual and individual assigns with this way
	}
	//another constructor
	public Persona(int DNI, String name) {
		this.DNI = DNI; //Java knows how to diff between our DNI and the param DNI thanks to the .this
		this.setName(name); //we can use our own methods in constructor to set values
		this.age = 22;
		//this.dateBirth = 1st of January 2000;
		this.sex = "female";
		this.weight = 1;
		this.height = 1;
		this.bomber = new Bombero("patricio", this); //with "this" we pass the current constructor "Persona" as param
		//now if someone wants to know the name of the Bombero object, can ask directly to the Bombero through its getNameMethod
		//bombero.getName();
	}
	//another one
	public Persona(int DNI, String name, int age, String sex, int weight, int height) {
		//now we have a constructor that we will call in other constructors to set the attr
		//values more easily, because in this one we pass everything as args-params
		this.DNI = DNI;
		this.setName(name);
		this.age = age;
		//this.dateBirth = 1st of January 2000;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
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
