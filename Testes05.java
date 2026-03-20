/* 
 * criar um algoritmo que use uma função para fazer essa conversão. 
 * A função deve receber o valor em reais e a taxa de câmbio como entrada, 
 * e retornar o valor convertido. 
 */

package testesRapidos;
import java.util.Scanner;

public class Testes05 {
	
	//função câmbio
	public static double cambio(double real, double taxaCambio) {
		return real / taxaCambio;
		}
	
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	System.out.println("Entre com o valor em reais R$ ");
	double real = entrada.nextDouble();
	System.out.println("Entre com a taxa de câmbio do dia (valor do dólar $ ) ");
	double taxaCambio = entrada.nextDouble();
	
	double resultado = cambio(real, taxaCambio);
	System.out.println(String.format("O valor em dólares é $ %.2f", resultado));
	}
}


