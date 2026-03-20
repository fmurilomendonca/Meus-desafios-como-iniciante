/*pedir as despesas do usuário
 * ao digitar despesa "0" o programa encerra
 * mostra o total das despesas
 */

package testesRapidos;
import java.util.Scanner;

public class Testes01 {
	public static void main(String[] args) {
	double total = 0;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o valor de cada despesa: ");
	double despesa = entrada.nextDouble();
	
	while (despesa != 0) {
		total = total + despesa;
		System.out.println("Digite a próxima despesa: ");
		despesa = entrada.nextDouble();
		
	}
	System.out.println("Sua despesa total é R$ " + total);
	}
}
