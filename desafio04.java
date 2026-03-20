//Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). 
//Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.


package modulo02;

public class desafio04 {
	static public void main (String[] args) {
		double precoProduto = 3.251;
		int quantidade = 4;
		double total = precoProduto * quantidade;
		System.out.println(String.format(" O valor do produto é %.2f \n A quantidade adquirida foi %d \n O valor a pagar é %.2f ", precoProduto, quantidade, total));
		System.out.println("");
		String mensagem = """
						O valor do produto é %.2f 
						A quantidade adquirida foi %d 
						O valor a pagar é %.2f """.formatted(precoProduto, quantidade, total);
		System.out.println(mensagem);
		
		
	}

}
