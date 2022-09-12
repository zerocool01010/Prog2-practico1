package ej2;

public class Electrodomestico {
	final int LowConsumeMax = 45;
	//attr
	private String name;
	private double mainprice;
	private String color;
	private double energyConsume;
	private int weight;
	//constructors
	public Electrodomestico (String name) {
		this(name, 100);
	}
	public Electrodomestico (String name, double mprice) {
		this(name, mprice, "gris plata");
	}
	public Electrodomestico (String name, double mprice, String color) {
		this(name, mprice, color, 10);
	}
	public Electrodomestico (String name, double mprice, String color, double eCons) {
		this(name, mprice, color, eCons, 2);
	}
	public Electrodomestico (String name, double mprice, String color, double eCons, int w) {
		this.setName(name);
		this.setMainprice(mprice);
		this.setColor(color);
		this.setEnergyConsume(eCons);
		this.setWeight(w);
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMainprice() {
		return mainprice;
	}
	public void setMainprice(double mainprice) {
		this.mainprice = mainprice;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getEnergyConsume() {
		return energyConsume;
	}
	public void setEnergyConsume(double energyConsume) {
		this.energyConsume = energyConsume;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//methods
	public boolean getIsItLowConsume() {
		if (this.energyConsume >= LowConsumeMax) {
			return false;
		}
		return true;
	}
	
	public double getBalance() {
		return (this.mainprice / this.weight);
	}
	
	public boolean getIsItHighEnd() {
		if (this.getBalance() > 3) {
			return true;
		}
		return false;
	}
	
}
