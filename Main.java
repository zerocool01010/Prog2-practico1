
package ej1;
import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Persona Manuel = new Persona();
		
		System.out.println("El indice de masa corporal es de: " +Manuel.getBodyMassIndex());
		System.out.println("Está en forma?: " + Manuel.getIsItInShape());

	}
}
