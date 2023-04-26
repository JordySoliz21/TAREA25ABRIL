package Tarea25abri;
import java.util.Scanner;
import java.util.Random;
public class leerCadena_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Ingrese una cadena: ");
		String CADENA = tc.nextLine();
		int TAMANO = CADENA.length();
		
		System.out.println("El tamano de la cadena es: " + TAMANO);
		System.out.print("La cadena desordenada es: ");
		
		Random rand = new Random();
		char[] caracteres=CADENA.toCharArray();
		for (int i = caracteres.length- 1; i>0; i--) {
			int indice=rand.nextInt(i+1);
		char temp = caracteres[indice];
		caracteres[indice] = caracteres[i];
		caracteres[i] = temp;
		
		}
		System.out.println(new String(caracteres));
}
}