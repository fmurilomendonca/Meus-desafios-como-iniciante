/*Declare uma variável do tipo double precoOriginal. 
Atribua um valor em reais a essa variável, representando o preço original de um produto. 
Em seguida, declare uma variável do tipo double percentualDesconto e 
atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). 
Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
*/


package modulo02;

public class desafio06 {
	static public void main(String[] args) {
		double precoOriginal = 31.42;
		double percentualDesconto = 10; //10%
		double novoPreco = (precoOriginal * ((100 - percentualDesconto)/100));
		double desconto = precoOriginal - novoPreco;
		 
		System.out.println(String.format("O desconto foi de %.2f\n o novo preço é %.2f", desconto, novoPreco));
	}

}
