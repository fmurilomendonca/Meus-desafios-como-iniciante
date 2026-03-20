/*Você está desenvolvendo um sistema para uma empresa de delivery. 
 * O valor da taxa de entrega depende da distância até o cliente e 
 * se o pedido foi feito em um dia de chuva.
 * Para entregas até 5 km, a taxa é R$ 5,00.
 * Entre 5 e 10 km, a taxa é R$ 8,00.
 * Acima de 10 km, a taxa é R$ 10,00.
 * Se estiver chovendo, acrescenta R$ 2,00 à taxa padrão. 
 */

package testesRapidos;
import java.util.Scanner;

public class Testes04 {
	public static void main(String[] args) {
	
	//variáveis
	String resposta = "s";
	double valorEntrega = 0;
	double total = 0;
	
	//entrada do usuário
	Scanner entrada = new Scanner(System.in);
	System.out.println("Está chovendo? ");
	String estaChovendo = entrada.nextLine();
	System.out.println("Qual a distância percorrida durante a entrega (km) ? ");
	int distanciaPercorrida = entrada.nextInt();
	
	//verificação da distância percorrida na entrega
	if (distanciaPercorrida <= 5) {
		valorEntrega = 5;
	} else {
		if (distanciaPercorrida >= 11) {
		valorEntrega = 10;
		} else {
			valorEntrega = 8;
		}
	}
	
	//verificação se choveu
	if (resposta.equals(estaChovendo)) {
	total = valorEntrega + 2;
	System.out.println(String.format("O valor da entrega é R$ %.2f", total));
	} else {
		System.out.println(String.format("O valor da entrega é R$ %.2f ", valorEntrega));
	}
	
	}
}




