//Calculo da media ponderada
//Autor: Murilo
//04/03/2026

package exercicio;

public class Capitulo03_exercicio04 {
	
	public static void main(String[] args) {
		double nota1 = 8;
		double nota2 = 9.5;
		int peso1 = 2;
		int peso2 = 3;
		double media_ponderada = ((nota1 * peso1)+(nota2 * peso2))/(peso1 + peso2);
		
		System.out.println("A média ponderada é: " +media_ponderada);
						
	}

}
