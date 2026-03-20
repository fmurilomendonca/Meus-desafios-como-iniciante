/*Crie um programa que solicite ao usuário 
 * um número e calcule o fatorial desse número.
 */

package modulo03;
import java.util.Scanner;
import java.util.ArrayList; // Importação necessária


public class DesafioHoraDaPratica06 {
	public static void main(String[] args) {
		
		int i, numero, fatorial = 1;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número ");
		numero = entrada.nextInt();
		System.out.print(numero + "! = ");
						
		if (numero < 0) {
			System.out.println("Não existe fatorial de número negativo");
		} else {
				for (i = numero; i >= 1 ; i--) {
			
					fatorial = fatorial * i;
						if (i > 1) {
						System.out.print(i + " x ");
						} else {
						System.out.print(i + " = ");
						}
				}
			System.out.print(fatorial);
			}
		entrada.close();
	}
}