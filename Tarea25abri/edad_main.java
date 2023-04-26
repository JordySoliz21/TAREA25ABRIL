package Tarea25abri;
import java.util.Scanner;
public class edad_main {

	public static void main(String[] args) {
		Scanner tc =  new Scanner(System.in);
		
		System.out.print("Ingrese su edad: ");
		int edad = tc.nextInt();
		tc.close();
		
		if (edad < 10) {
			System.out.println("Es nino.");
		} else if (edad <= 15) {
			System.out.println("Es adolescente.");
		} else if (edad <= 20){ 	
			System.out.println("Es joven.");
		} else if (edad <= 30) {
			System.out.println("Es adulto.");
		} else if (edad <= 50) {
			System.out.println("Es senor.");
		}else {
			System.out.println("EDAD FUERA DE RANGO.");
		}
	}

}
