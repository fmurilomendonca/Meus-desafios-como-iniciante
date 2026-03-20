//Crie um programa que realize a média de duas notas decimais e exiba o resultado.

package modulo02;

public class desafio01 {
	static public void main(String[] args) {
		double nota1 = 9.41;
		double nota2 = 8.63;
		double media = (nota1 + nota2)/2;
		
		System.out.println(String.format("A média de %.2f e %.2f é %.2f ", nota1, nota2, media));
				
	}

}
