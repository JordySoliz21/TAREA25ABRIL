package Tarea25abri;
import java.util.Scanner;
public class Switch_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.print("Ingrese uno de los caracteres (+, -, /, *): ");
		char op=tc.next().charAt(0);
		System.out.print("Ingrsese aqui 2 numeros: ");
		int num1 = tc.nextInt();
		int num2 = tc.nextInt();
		int Resultado = 0;
		
		switch (op) {
		case'+':
			Resultado = num1+num2;
			break;
		case'-':
			Resultado = num1-num2;
			break;
		case'/':
			Resultado = num1/num2;
			break;
		case'*':
			Resultado = num1*num2;
			break;
		default:
			System.out.println("Operacion invalida.");
			return;
		}
		
		System.out.println("El resultado de la operacion es: " + Resultado);

	}
}