
package ej1;
import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Persona Manuel = new Persona("Manuel", 28, 37766544, LocalDate.of(1993, 21, 12), "male", 78, 1.76);
		
		System.out.println("El indice de masa corporal es de: " +Manuel.getBodyMassIndex());
		System.out.println("Está en forma?: " + Manuel.getIsItInShape());
		System.out.println("Es su cumpleaños?: " + Manuel.getIsItBirthDay());
		System.out.println("Es mayor de edad?: " + Manuel.getIsItOlderThan18());
		System.out.println("Puede votar?: " + Manuel.getCanVote());
		System.out.println("Es coherente fecha de nacimiento y edad?: "+Manuel.getCoherenceBetweenAgeAndDate());
		System.out.println("La informacion del objeto Manuel es: " + Manuel.getObjectInfo());
	}
}
