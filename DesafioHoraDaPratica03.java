/*Crie um menu que oferece duas opções ao usuário: 
 * "1. Calcular área do quadrado" e "2. Calcular área do círculo". 
 * Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 * 
 * Estou recomeçando os fundamentos JAVA
 * Mais adiante vou me aprofundar usando try-catch e InputMismatchException
 */

package modulo03;
import java.util.Scanner;

public class DesafioHoraDaPratica03 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("     *-*-*-*-  M E N U *-*-*-*        ");
		System.out.println("Para calcular a área do quadrado [01] ");
		System.out.println(" ");
		System.out.println("Para calcular a área do círculo  [02] ");
		System.out.println(" ");
		System.out.println("Para encerrar                    [99] ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Digite sua opção [  ] ");
		System.out.println("Não digite letras. Qualquer outra opção encerra o programa.");
		int opcao = entrada.nextInt();
		
		if (opcao == 99) {
			//System.out.println("...");
		} else {
			if (opcao != 01 && opcao != 02) {
			System.out.println("Opção inválida.");
			}
		}
		if (opcao == 01) {
			
			System.out.println("Cálculo da área do quadrado ");
			System.out.println("Digite um lado do quadrado ");
			int lado1 = entrada.nextInt();
			System.out.println("Digite o outro lado do quadrado ");
			int lado2 = entrada.nextInt();
			if (lado1 <=0 || lado2 <=0) {
				System.out.println("Um dos lados é igual a 0. Impossivel ser um quadrado.");
			} else {
			int area = lado1 * lado2;
			System.out.println("A área do quadrado é " + area);
			}
		}
		if (opcao == 02) {
			System.out.println("Cálculo da área do círculo ");
			System.out.println("Digite o raio ");
			int raio = entrada.nextInt();
			if (raio <= 0) {
				System.out.println("O raio não pode ser negativo ou zero.");
			} else {
			double pi = 3.14;
			double area = pi * (raio * raio);
			System.out.println("A área do círculo é " + area);
			}
		}
		System.out.println("Programa encerrado.");
	} 
}