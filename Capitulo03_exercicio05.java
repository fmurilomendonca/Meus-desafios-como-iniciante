//Calculo de 10% de desconto sobre um produto
//Autor: Murilo
//04/03/2026

package exercicio;

public class Capitulo03_exercicio05 {
	public static void main(String[] args) {
		double preco = 10.75;
		double desconto = 0.10; //10%
		double novo_preco = preco * (1 - desconto);
		
		System.out.println("O preço do produto é R$ " +preco);
		System.out.println("Você recebeu um desconto de " + (desconto*100) + "%");
		System.out.println("O valor do desconto é: " + (preco - novo_preco));
		System.out.println("Você vai pagar R$ " + novo_preco);
	}

}
