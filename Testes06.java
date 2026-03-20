/* Você foi contratado por uma cafeteria que deseja automatizar o 
 * atendimento no balcão. O sistema deve permitir que o atendente 
 * registre os pedidos de cada cliente, calcule o valor total e 
 * aplique um desconto de 10% para clientes cadastrados.
 * O processo deve funcionar da seguinte forma:

	O atendente informa quantos itens o cliente vai pedir.
	Para cada item, o sistema solicita o nome e o preço.
	Ao final, o sistema pergunta se o cliente é cadastrado.
	Se for, aplica o desconto e exibe o valor com desconto.
	Caso contrário, exibe o valor cheio. 
 */

package testesRapidos;
import java.util.Scanner;

public class Testes06 {
		
	public static void main(String[] args) {

		double precoUnitario = 0;
		double totalPorProduto = 0;
		double precoTotalCompras = 0;
		double desconto = 0;
		double carrinhoFinal = 0;
		
		int quantidadeDeItens = 0;
		
		String ehCliente = "s";
		String produto = "x";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Autor: Murilo       v.1   18/03/2026");
		System.out.println("Digite 'x' para encerrar o programa.\n====================================\n");
	
		while (! produto.equals(" ")) {
			
			System.out.print("Digite o produto: ");
			produto = entrada.nextLine();
		
			if (produto.equals("x")) {
			
			break;
			} else {
		
				System.out.print("Quantidade: ");
				quantidadeDeItens = entrada.nextInt();
				System.out.print("Preço Unitário: ");
				precoUnitario = entrada.nextDouble();
				entrada.nextLine();
						
				totalPorProduto = quantidadeDeItens * precoUnitario;
				System.out.println(String.format("%s : %d x R$ %.2f = R$ %.2f \n====================================", produto, quantidadeDeItens, precoUnitario, totalPorProduto));
				precoTotalCompras = precoTotalCompras + totalPorProduto;
				
			}
		
		}
			System.out.println(String.format("=================================\nTotal do carrinho é %.2f ", precoTotalCompras));
			if (precoTotalCompras == 0) {
				System.out.println();
				} else {
					System.out.println(" ");
					System.out.println("É cliente cadastrado? ");
					ehCliente = entrada.nextLine();
				
					if (ehCliente.equals("s")) {
						desconto = precoTotalCompras * 0.10;
						carrinhoFinal = precoTotalCompras - desconto;
						System.out.println(String.format("Você obteve um desconto de R$  %.2f \nO valor da suas compras é R$ %.2f", desconto, carrinhoFinal));
					} else {
						System.out.println(String.format("O valor de suas compras é R$ %.2f ", precoTotalCompras));
				}
						
			}
	
			System.out.println("\n=================================\n   **** Sistema encerrado ****");
			entrada.close();
	}
}


