
package ej1;
import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Persona pedro = new Persona();
		
		System.out.println(pedro.getDni());
		System.out.println(pedro.getBodyMassIndex());
		
		LocalDate hoy = LocalDate.now();
		System.out.println("hoy es: " +hoy);

	}
}
