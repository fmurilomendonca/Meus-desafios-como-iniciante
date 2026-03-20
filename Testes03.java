/*Você está desenvolvendo o sistema de bilheteria para um cinema. 
 * Os clientes podem ter direito a meia-entrada em duas situações:
 *	Se tiverem menos de 18 anos
	ou
	Se forem estudantes
	Sua tarefa é criar um algoritmo que avalie as informações do 
	cliente e exiba uma mensagem indicando se ele tem ou não direito ao desconto. 
 */

package testesRapidos;
import java.util.Scanner;

public class Testes03 {
	public static void main(String[] args) {
	int idade;
	String estudante = "s";
	String resposta = "s";
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("É estudante? (s)im ou (n)ão");
	estudante = entrada.nextLine();
	System.out.println("Qual a idade? ");
	idade = entrada.nextInt();
	
		if (idade <= 17 || estudante.equals(resposta)) {
			System.out.println("Tem direito ao desconto. Meia entrada aplicada.");
		} else  {
			System.out.println("Sem direito ao desconto. Valor integral");
		}
	}
}


