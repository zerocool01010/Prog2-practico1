//if a I wanna import some class or librarie outside the package, must do the proper import:
//import java.util.library
package ej1;
import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Persona pedro = new Persona();
		
		//how do we call an object? always following the next syntax: object.message() where the message is a method
		System.out.println(pedro.getDni());
		System.out.println(pedro.getBodyMassIndex());
		
		//never do this!
		//pedro.height = 24;
		//never! always call the method, for example: pedro.setHeight(24);
		//why? because with the method I have absolute control on how the attr may be changed from outside, adding the logic
		//to manage what comes from parameter-args
	}
}
