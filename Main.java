package ej2;

public class Main {
	public static void main(String[] args) {
		
		Electrodomestico defaultElectr = new Electrodomestico("default");
		
		System.out.println("Es de bajo consumo el default?: "+defaultElectr.getIsItLowConsume());
	}
}
