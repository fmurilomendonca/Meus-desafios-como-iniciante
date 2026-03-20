/* Crie um programa que solicite ao usuário um número 
 * e exiba a tabuada desse número de 1 a 10.
 */

package modulo03;
import java.util.Scanner;

public class DesafioHoraDaPratica04 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Entre com um número para fazer a tabuada ");
		int numero = entrada.nextInt();
		System.out.println("Tabuada do número " + numero);
		
		int contador = 1;
		
		for (numero = numero; contador <=10; contador ++) {
			System.out.println(numero + " X " + contador +" = " + (numero * contador));		
			}
	} 
}