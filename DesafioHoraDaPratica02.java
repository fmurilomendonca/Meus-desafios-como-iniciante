/*Peça ao usuário para inserir dois números inteiros. 
 * Compare os números e imprima uma mensagem indicando 
 * se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
 * 
 * Estou recomeçando os fundamentos JAVA
 * Mais adiante vou me aprofundar usando try-catch e InputMismatchException
 */

package modulo03;
import java.util.Scanner;

public class DesafioHoraDaPratica02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int numero01 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero02 = entrada.nextInt();
		
		if (numero01 == numero02) {
			//System.out.println(String.format("O número %d e %d são iguais", numero01, numero02));
			System.out.println("O número " + numero01 + " é igual ao número " + numero02);
		} else {
			System.out.println(String.format("O número %d e %d são diferentes", numero01, numero02));
			if (numero01 > numero02) {
				System.out.println("O numero " + numero01 + " é maior que o número " + numero02);
			} else {
					System.out.println("O numero " + numero01 + " é menor que o número " + numero02);
				}
			}
		}
	}

