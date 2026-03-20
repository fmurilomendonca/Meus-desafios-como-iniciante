/*Crie um programa que solicite ao usuário digitar um número. 
 * Se o número for positivo, exiba "Número positivo", 
 * caso contrário, exiba "Número negativo".
 * 
 * Estou recomeçando os fundamentos JAVA
 * Mais adiante vou me aprofundar usando try-catch e InputMismatchException
 */

package modulo03;
import java.util.Scanner;

public class DesafioHoraDaPratica01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		//System.out.println(numero);
		
		if (numero == 0) {
			System.out.println("O número digitado é nulo (zero).");	
		}
		if (numero > 0 && numero != 0) {
			System.out.println("O número " +numero + " é um número positivo.");
		} else {
			if (numero < 0 && numero != 0) {
				System.out.println("O número " +numero + " é um número negativo.");
			}
						
		}
	}
}
		