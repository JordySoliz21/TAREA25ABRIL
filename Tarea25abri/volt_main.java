package Tarea25abri;
import java.util.Scanner;
public class volt_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de voltajes: ");
		int n = tc.nextInt();
		double []volt = new double [n];
		double sum = 0;
		for(int i=0; i<n; i++) {
			System.out.print("Ingrese el voltaje " + (i+1)+ ": ");
		volt[i]= tc.nextDouble();
		sum+=volt[i];
		}
		double prom = sum/n;
		double Mayor = n;
		double Menor = n;
		
	for (int i=1; i<n; i++) {
	if (volt[i] > Mayor) {
		Mayor = volt[i];
	}
	if (volt[i] > Mayor) {
		Menor=volt [i];
	}
}
	System.out.println("El mayor voltaje es: " + Mayor);
	System.out.println("El menor voltajes es: " + Menor);
	System.out.println("El promedio del voltajes es: " + prom);
	}
}
