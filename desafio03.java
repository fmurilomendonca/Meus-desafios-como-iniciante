// Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). 
// Atribua valores a essas variáveis e concatene-as em uma mensagem.

package modulo02;


public class desafio03 {

	static public void main(String[] args) {
		char letra = 'A';
		String palavra = "lura";
		System.out.println(String.format("%c%s", letra, palavra));
		System.out.println(letra + palavra);
	}
	
}
